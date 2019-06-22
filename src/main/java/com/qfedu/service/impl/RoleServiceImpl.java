package com.qfedu.service.impl;

import com.qfedu.dao.AuthorityDao;
import com.qfedu.dao.RoleDao;
import com.qfedu.pojo.Authority;
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
    @Autowired(required = false)
    private AuthorityDao authorityDao;

    //根据条件查询展现所有
    @Override
    public Map<String, Object> rolepage(String info) {

        List<Role> list = roleDao.findAllByName(info);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("data",list);
        return map;
    }

    //删除
    @Override
    public void deleteById(Integer id) {
        roleDao.deleteById(id);
    }

    //查看所有的权限
    @Override
    public List<Authority> findAllAuthority() {
        return authorityDao.findAllAuth();
    }

    //修改角色权限信息
    @Override
    public void userRoleEdit(Integer id, Integer[] aids) {

        roleDao.deleteRoleAById(id);
        if(aids!=null){
            roleDao.insertRoleA(id,aids);
        }
    }
}
