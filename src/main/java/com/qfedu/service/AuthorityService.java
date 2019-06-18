package com.qfedu.service;

import com.qfedu.pojo.Authority;

import java.util.List;

/**
 * Created by Administrator on 2019/6/17 0017.
 */
public interface AuthorityService {
    List<Authority> findUserMenuByNo(String no);
}
