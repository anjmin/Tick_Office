package com.qfedu.dao;

import com.qfedu.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2019/6/14 0014.
 */
public interface UserDao {

    // 根据用户名查找用户
    User findByName(String name);

    //根据用户查询用户拥有的角色
    List<String> findRolesByName(String name);
    //根据用户查询用户拥有的权限
    List<String> findPermsByName(String name);

}
