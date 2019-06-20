package com.qfedu.service;

import com.qfedu.pojo.Authority;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/17 0017.
 */
public interface AuthorityService {
    List<Authority> findUserMenuByNo(String no);

    //展示所有权限
    Map<String, Object> findAllAuth(Integer page, Integer limit);

    //添加权限
    void addAuth(Authority auth);
}
