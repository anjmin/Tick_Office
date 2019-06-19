package com.qfedu.service;

import java.util.Map;

/**
 * Created by Administrator on 2019/6/14 0014.
 */
public interface UserService {

    //用户角色展示列表、根据关键字查询
    Map<String,Object> findAllByNoAndFg(String no, Integer flag, Integer page, Integer limit);
}
