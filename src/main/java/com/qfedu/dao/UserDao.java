package com.qfedu.dao;

import com.qfedu.pojo.Role;
import com.qfedu.pojo.User;
import org.apache.ibatis.annotations.Param;

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

    //查询所有用户角色
    List<User> findAllByNoAndFg(@Param("no") String no, @Param("flag") Integer flag);

    //删除用户角色
    void deleteById(Integer id);
    //领导
    List<User> selectM();

    String selectUserName(String startno);

    Integer findUserId(String startno);

    //查找用户角色
    List<Role> findAllRole();

    //根据id删除用户角色
    void deleteUserRoleById(Integer id);

    //根据id,角色修改用户角色
    void insertUserRole(@Param("id") Integer id, @Param("rids") Integer[] rids);


    long findByAllT();

    //查询登录用户信息
    List<User> findUserInfoByNo(String no);
}
