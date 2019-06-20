package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.UserDao;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserDao userDao;

    //用户角色展示列表、根据关键字查询
    @Override
    public Map<String, Object> findAllByNoAndFg(String no, Integer flag, Integer page, Integer limit) {

        PageHelper.startPage(page,limit);
        List<User> list = userDao.findAllByNoAndFg(no, flag);
        Map<String, Object> map = new HashMap<>();

        //总记录数
        long total = ((Page)list).getTotal();
        //总页数
        int pages = ((Page)list).getPages();
        map.put("code",0);
        map.put("msg","");// 总记录数
        map.put("count", total);
        map.put("data", list);

        return map;
    }

    @Override
    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }



}
