package com.qfedu.dao;

import com.qfedu.pojo.Authority;

import java.util.List;

/**
 * Created by Administrator on 2019/6/17 0017.
 */
public interface AuthorityDao {

    //查询菜单
    List<Authority> findUserMenuByNo(String no);
}
