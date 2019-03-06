package com.qf.resumemanagerweb.controller;

import com.qf.resumemanagerpojo.Manager;
import com.qf.resumemanagerservice.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    /**
     * 增加管理员
     * @param manager
     * @return
     */
    @ResponseBody
    @PostMapping("{manager}")
    public String insertManager(Manager manager){
        //System.out.println(manager);
        Integer m = managerService.insertManager(manager);
        if (m == null) {
            String s="添加管理员"+manager.getName()+"失败!";
            return s;
        }else{
            return "添加管理员"+manager.getName()+"成功!";
        }
    }

    /**
     * 删除管理员
     * @param manager
     * @return
     */
    @ResponseBody
    @DeleteMapping("{manager}")
    public String deleteManager(Manager manager) {
        //System.out.println(manager);
        Integer m = managerService.deleteManager(manager);
        if (m == null) {
            return "删除管理员id为"+manager.getId()+"失败!";
        }else {
            return "删除管理员"+manager.getId()+"成功!";
        }
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
    @ResponseBody
    @GetMapping("{managers}")
    public List<Manager> listManagersJson(){
        List<Manager> list = managerService.listManagersJson();
        System.out.println(list.toString());
        return list;
    }

    /**
     * 查询单个管理员
     */
    @ResponseBody
    @GetMapping("manager/{id}")
    public Manager listManager(Manager manager){
        System.out.println("查询单个管理员信息接口接收到的参数是:"+manager);
        Manager m = managerService.listManager(manager);
        System.out.println("从后台查询得到的单个管理员信息是:"+m);
        return m;
    }
}