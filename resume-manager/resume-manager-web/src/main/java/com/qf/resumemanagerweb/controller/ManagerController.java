package com.qf.resumemanagerweb.controller;

import com.qf.resumemanagerpojo.BaseResult;
import com.qf.resumemanagerpojo.Manager;
import com.qf.resumemanagerservice.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping("/managers_list")
    public String index(){
        return "managers_list";
    }

    /**
     * 增加管理员
     * @param manager
     * @return
     */
    @ResponseBody
    @PostMapping("{manager_add}")
    public String insertManager(Manager manager){
        //System.out.println(manager);
        Integer result = managerService.insertManager(manager);
        if (result == null) {
            String s="添加管理员"+manager.getName()+"失败!";
            return s;
        }else{
            return "添加管理员成功!";
        }
    }

    /**
     * 删除管理员
     */
    @ResponseBody
    @DeleteMapping("{id}")
    public void deleteManager(@PathVariable("id") String id, Model model) {
        //System.out.println(manager);
        Integer m = managerService.deleteManager(Integer.parseInt(id));
        if (m != null) {
            listManagersJson(model);
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
        Manager manager=new Manager();
        Integer manager_id=Integer.parseInt(id);
        if(id!=null&&manager_id!=-1){
            System.out.println("跳转到manager_id"+manager_id);
            manager=managerService.listManager(manager_id);
        }
        model.addAttribute("manager",manager);
        return "manager_from";
    }
    /**
     * 修改管理员
     * @param manager
     * @return
     */
    @ResponseBody
    @PutMapping("{manager}")
    public String updateManager(Manager manager) {
        //manager.setUpdate(new Date());
        System.out.println(manager);
        Integer m = managerService.updateManager(manager);
        if (m == null) {
            return "修改id为" + manager.getId() + "的管理员失败!";
        }else {
            return "修改id为" + manager.getId() + "的管理员成功!";
        }
    }

    /**
     * 查询所有管理员
     * @return
     */
    @GetMapping("")
    public String listManagersJson(Model model){
        BaseResult<Manager> baseResult = new BaseResult<>();
        List<Manager> managers = managerService.listManagersJson();
        baseResult.setData(managers);
        baseResult.setMessage("查询成功");
        baseResult.setStatus(200);
        model.addAttribute("baseResult",baseResult);
        model.addAttribute("count", 20);
        return "manager_list";
    }

    /**
     * 查询单个管理员
     */
//    @ResponseBody
//    @GetMapping("manager/{id}")
//    public Manager listManager(Manager manager){
//        System.out.println("查询单个管理员信息接口接收到的参数是:"+manager);
//        Manager m = managerService.listManager(manager);
//        System.out.println("从后台查询得到的单个管理员信息是:"+m);
//        return m;
//    }
}