package com.qf.resumemanagerserviceimpl.serviceimlp;

import com.qf.resumemanagerdao.dao.UserMapper;
import com.qf.resumemanagerpojo.User;
import com.qf.resumemanagerservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser() {
        User user=userMapper.getUser();
        System.out.println(user+"111111111111111111111");
        return user;
    }
}
