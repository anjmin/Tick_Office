package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.UserDao;
import com.qfedu.pojo.Role;
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
       long to = userDao.findByAllT();

        //总记录数
        long total = to ;

        map.put("code",0);
        map.put("msg","");// 总记录数
        map.put("count", total);
        map.put("data", list);

        return map;
    }

    //删除用户角色
    @Override
    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }


    @Override
    public List<User> selectM() {
        List<User> list = userDao.selectM();
        return list;
    }

    @Override
    public String selectUserName(String startno) {
        return userDao.selectUserName(startno);
    }

    @Override
    public Integer findUserId(String startno) {
        return userDao.findUserId(startno);
    }


    //查找用户角色
    @Override
    public List<Role> findAllRole() {
        return userDao.findAllRole();
    }

    //查找修改用户角色
    @Override
    public void userRoleEdit(Integer id, Integer[] rids) {

        userDao.deleteUserRoleById(id);
        if(rids!=null){
            userDao.insertUserRole(id,rids);
        }
    }

    //查询登录用户信息
    @Override
    public List<User> findUserInfoByNo(String no) {
        List<User> list = userDao.findUserInfoByNo(no);

        return list;
    }
}
