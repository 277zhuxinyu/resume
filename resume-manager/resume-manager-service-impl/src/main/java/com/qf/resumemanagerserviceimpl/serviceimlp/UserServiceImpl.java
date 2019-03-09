package com.qf.resumemanagerserviceimpl.serviceimlp;

import com.qf.resumemanagerdao.dao.UserMapper;
import com.qf.resumemanagerpojo.User;
import com.qf.resumemanagerservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String id) {
        User user=userMapper.getUser(id);
        return user;
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(String id) {
        userMapper.deleteUser(id);
    }

   @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public int countUser() {
        return userMapper.countUser();
    }

    @Override
    public void deleteUsers(String ids) {
        String[] ids_arr = ids.split(",");
        userMapper.deleteUsers(ids_arr);
    }
}
