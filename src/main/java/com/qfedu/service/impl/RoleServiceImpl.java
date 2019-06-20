package com.qfedu.service.impl;

import com.qfedu.dao.RoleDao;
import com.qfedu.pojo.Role;
import com.qfedu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/19.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired(required = false)
    private RoleDao roleDao;


    @Override
    public Map<String, Object> findRoleAll() {
        List<Role> list = roleDao.findRoleAll();
        Map<String, Object> map = new HashMap<>();


        map.put("code",0);
        map.put("msg","");
        map.put("data", list);
        return map;
    }

}
