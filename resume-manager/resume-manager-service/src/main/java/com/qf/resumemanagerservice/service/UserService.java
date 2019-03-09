package com.qf.resumemanagerservice.service;


import com.qf.resumemanagerpojo.User;

import java.util.List;

public interface UserService {

    User getUser(String id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(String id);

   List<User> getAllUser();

    int countUser();

    void deleteUsers(String ids);
}
