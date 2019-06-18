package com.qfedu.service.impl;

import com.qfedu.dao.UserDao;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserDao userDao;

}
