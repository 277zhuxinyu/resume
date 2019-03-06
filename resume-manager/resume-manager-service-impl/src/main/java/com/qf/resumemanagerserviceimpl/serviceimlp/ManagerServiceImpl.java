package com.qf.resumemanagerserviceimpl.serviceimlp;

import com.qf.resumemanagerdao.dao.ManagerMapper;
import com.qf.resumemanagerpojo.Manager;
import com.qf.resumemanagerservice.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ManagerServiceImpl implements ManagerService{

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Integer insertManager(Manager manager) {
        Integer m = managerMapper.insertManager(manager);
        return m;
    }

    @Override
    public Integer deleteManager(Manager manager) {
        Integer m = managerMapper.deleteManager(manager);
        return m;
    }

    @Override
    public Integer updateManager(Manager manager) {
        Integer m = managerMapper.updateManager(manager);
        return m;
    }

    @Override
    public List<Manager> listManagersJson() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "success");
        List<Manager> list = managerMapper.listManagersJson();
        return list;
    }

    @Override
    public Manager listManager(Manager manager) {
        Manager m = managerMapper.listManager(manager);
        return m;
    }

}
