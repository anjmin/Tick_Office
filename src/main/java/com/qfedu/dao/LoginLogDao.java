package com.qfedu.dao;

import com.qfedu.pojo.LoginLog;

import java.util.List;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
public interface LoginLogDao {

    List<LoginLog> findLoginLog(String no);
}
