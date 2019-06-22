package com.qfedu.service;


import com.qfedu.pojo.User;

import com.qfedu.pojo.Role;


import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14 0014.
 */
public interface UserService {

    //用户角色展示列表、根据关键字查询
    Map<String,Object> findAllByNoAndFg(String no, Integer flag, Integer page, Integer limit);

    //删除用户角色
    void deleteById(Integer id);


    List<User> selectM();

    String selectUserName(String startno);

    Integer findUserId(String startno);

    //查找用户角色
    List<Role> findAllRole();

    //修改用户角色
    void userRoleEdit(Integer id, Integer[] rids);



}
