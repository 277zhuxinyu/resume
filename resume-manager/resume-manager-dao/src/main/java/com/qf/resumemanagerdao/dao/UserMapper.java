package com.qf.resumemanagerdao.dao;

import com.qf.resumemanagerpojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User getUser(String id);


    void addUser(User user);

    void updateUser(User user);

    void deleteUser(String id);

    List<User> getAllUser();

    int countUser();

    void deleteUsers(String[] ids_arr);
}
