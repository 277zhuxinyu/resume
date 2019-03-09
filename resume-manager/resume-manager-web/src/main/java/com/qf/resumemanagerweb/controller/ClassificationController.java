package com.qf.resumemanagerweb.controller;

import com.qf.resumemanagerpojo.BaseResult;
import com.qf.resumemanagerpojo.Classification;
import com.qf.resumemanagerservice.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("classification")
public class ClassificationController {
    @Autowired
    private ClassificationService classificationService;

    /**
     * 查询所有的简历模板分类
     * @return
     */
    @GetMapping("")
    public String list(Model model){
        BaseResult<Classification> baseResult=new BaseResult<>();
        List<Classification> classifications=classificationService.getAllClassification();
        baseResult.setData(classifications);
        baseResult.setMessage("查询成功");
        baseResult.setStatus(200);
        model.addAttribute("baseResult",baseResult);
        model.addAttribute("count",20);
        return "classification_list";
    }

    /**
     * 根据id删除某条简历模板分类
     * @return
     */
    @ResponseBody
    @DeleteMapping("{id}")
    public void del(@PathVariable("id") String id,Model model){
        System.out.println("根据id删除某条简历模板分类"+id);
        Integer result=classificationService.deleteClassificationById(Integer.parseInt(id));
        if(result!=null){
            list(model);
        }
    }


    /**
     * 跳转到 新增/编辑 页面
     * @param model
     * @param id
     * @return
     */
    @GetMapping("from/{id}")
    public String list1(Model model,@PathVariable("id")String id){
        System.out.println("跳转到 新增/编辑 页面"+id);
        Classification classification=new Classification();
        Integer classification_id=Integer.parseInt(id);
        if(id!=null&&classification_id!=-1){
            System.out.println("跳转到classification_id"+classification_id);
            classification=classificationService.getClassificationById(classification_id);
        }
        model.addAttribute("classification",classification);
        return "classification_from";
    }
    /**
     * 添加简历模板分类
     * @return
     */
    @ResponseBody
    @PostMapping("{classification}")
    public String put(Classification classification){
        System.out.println("添加");
        Integer result=classificationService.insertClassification(classification);
        if(result!=null){
            return "添加成功";
        }
        return "添加失败";
    }
    /**
     * 根据id修改某条简历模板分类
     * @return
     */
    @ResponseBody
    @PutMapping("{classification}")
    public String update(Classification classification){
        System.out.println("修改");
        Integer result=classificationService.updateClassificationById(classification);
        if(result!=null){
            return "修改成功";
        }
        return "修改失败";
    }




}
