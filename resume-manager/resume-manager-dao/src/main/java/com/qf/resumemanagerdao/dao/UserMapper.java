package com.qf.resumemanagerdao.dao;

import com.qf.resumemanagerpojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUser();
}
