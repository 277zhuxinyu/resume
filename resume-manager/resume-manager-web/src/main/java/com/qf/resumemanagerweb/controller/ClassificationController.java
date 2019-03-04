package com.qf.resumemanagerweb.controller;

import com.qf.resumemanagerpojo.Classification;
import com.qf.resumemanagerpojo.User;
import com.qf.resumemanagerservice.service.ClassificationService;
import com.qf.resumemanagerservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    @ResponseBody
    @GetMapping("classifications")
    public List<Classification> lists(){
        List<Classification> classifications=classificationService.getAllClassification();
        return classifications;
    }

    /**
     * 查询所有的简历模板分类
     * @return
     */
    @ResponseBody
    @PostMapping("{classification}")
    public String put(Classification classification){
        Integer result=classificationService.insertClassification(classification);
        if(result!=null){
            return "添加成功";
        }
        return "添加失败";
    }

    /**
     * 根据id删除某条简历模板分类
     * @return
     */
    @ResponseBody
    @DeleteMapping("{classification}")
    public String del(Classification classification){
        Integer result=classificationService.deleteClassificationById(classification.getId());
        if(result!=null){
            return "删除成功";
        }
        return "删除失败";
    }

    /**
     * 根据id修改某条简历模板分类
     * @return
     */
    @ResponseBody
    @PutMapping("{classification}")
    public String update(Classification classification){
        Integer result=classificationService.updateClassificationById(classification);
        if(result!=null){
            return "修改成功";
        }
        return "修改失败";
    }




}
