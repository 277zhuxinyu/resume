package com.qf.resumemanagerdao.dao;

import com.qf.resumemanagerpojo.Manager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagerMapper {
    /**
     * 增加管理员
     */
     Integer insertManager(Manager manager);

    /**
     * 删除管理员
     */
    Integer deleteManager(Integer id);

    /**
     * 修改管理员
     */
    Integer updateManager(Manager manager);

    /**
     * 查询所有管理员
     */
    List<Manager> listManagersJson();

    /**
     * 查询单个管理员
     */
    Manager listManager(Integer id);
}
