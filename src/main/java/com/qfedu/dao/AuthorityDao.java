package com.qfedu.dao;

import com.qfedu.pojo.Authority;

import java.util.List;

/**
 * Created by Administrator on 2019/6/17 0017.
 */
public interface AuthorityDao {

    //查询菜单
    List<Authority> findUserMenuByNo(String no);

    //查找所有权限
    List<Authority> findAllAuth();

    //新增时查询所有
    List<Authority> findAllAuthByAdd();

    //新增权限
    void insertAuth(Authority auth);

    //删除权限
    void deleteAuthById(Integer id);
}
