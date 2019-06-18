package com.qfedu.service;

import java.util.Map;

/**
 * Created by Administrator on 2019/6/14 0014.
 */
public interface UserService {

    Map<String,Object> findAllByNoAndFg(String no, Integer flag, Integer page, Integer limit);

}
