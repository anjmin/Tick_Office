package com.qfedu.service.impl;

import com.qfedu.dao.LoginLogDao;
import com.qfedu.pojo.LoginLog;
import com.qfedu.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired(required = false)
    private LoginLogDao loginLogDao;

    @Override
    public Map<String, Object> findLoginLog(String no) {
        List<LoginLog> list = loginLogDao.findLoginLog(no);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("data", list);
        return map;
    }
}
