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
    public Map<String, Object> rolepage(String info) {
        List<Role> list = roleDao.findAllByName(info);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("data", list);
        return map;
    }



   /* @Override
    public Map<String, Object> rolepage(String info, Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Role> list = roleDao.findAllByName(info);
        //获取总记录数
        long total = ((Page) list).getTotal();
        // 获取总页数
        int pages = ((Page) list).getPages();

        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
    }*/

}
