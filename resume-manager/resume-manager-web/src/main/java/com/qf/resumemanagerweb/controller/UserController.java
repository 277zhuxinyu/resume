package com.qf.resumemanagerweb.controller;

import com.qf.resumemanagerpojo.User;
import com.qf.resumemanagerservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String getAllUsers(Model model){
        List<User> users=userService.getAllUser();
        int count=userService.countUser();
        model.addAttribute("users",users);
        model.addAttribute("count",count);
        return "user_list";
    }

    @GetMapping("getUser")
    public String getUser(String id,Model model){
        User user=userService.getUser(id);
        model.addAttribute("user",user);
        return "user_form";
    }
    @GetMapping("/add")
    public String add(){
        return "user_form2";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }


    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    public String addUser(User user){
        userService.addUser(user);
        return "redirect:/user/list";
    }

    @RequestMapping(value = "save",method = RequestMethod.POST)
    public String updateUser(User user){
        userService.updateUser(user);
        // map.put("修改成功",user);
        return "redirect:/user/list";
    }

    @RequestMapping(value = "deleteUser",method = RequestMethod.GET)
    public String updateUser(String id){
        userService.deleteUser(id);
        return "redirect:/user/list";
    }

    @RequestMapping(value = "deletemulti",method = RequestMethod.POST)
    public String deleteUsers(String ids){
        userService.deleteUsers(ids);
        return "redirect:/user/list";
    }
}
