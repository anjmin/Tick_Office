package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.AuthorityDao;
import com.qfedu.pojo.Authority;
import com.qfedu.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/17 0017.
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired(required = false)
    private AuthorityDao authorityDao;

    @Override
    public List<Authority> findUserMenuByNo(String no) {
        return authorityDao.findUserMenuByNo(no);
    }

    //展示所有权限
    @Override
    public Map<String, Object> findAllAuth(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Authority> list = authorityDao.findAllAuth();

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

    //添加权限
    @Override
    public void addAuth(Authority auth) {
        authorityDao.insertAuth(auth);
    }


    //根据页面传过来的pid设置parentId
    @Override
    public List<Authority> changePid(Integer pid) {
        return authorityDao.findAllAuth();
    }

    @Override
    public void deleteAuthById(Integer id) {
        authorityDao.deleteAuthById(id);
    }
}
