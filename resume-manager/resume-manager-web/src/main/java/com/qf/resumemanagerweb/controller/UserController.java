package com.qf.resumemanagerweb.controller;

import com.qf.resumemanagerpojo.User;
import com.qf.resumemanagerservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("test")
    public User test(){
        User user=userService.getUser();
        return user;
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }


}
