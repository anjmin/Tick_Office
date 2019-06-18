package com.qfedu.service.impl;

import com.qfedu.dao.AuthorityDao;
import com.qfedu.pojo.Authority;
import com.qfedu.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
