package com.qf.resumemanagerservice.service;

import com.qf.resumemanagerpojo.Manager;

import java.util.List;

public interface ManagerService {
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
     * 查询所有管理员信息
     */
    List<Manager> listManagersJson();

    /**
     * 查询单个管理员信息
     * @return
     */
    Manager listManager(Integer id);

}
