package com.qfedu.service;

import java.util.Map;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
public interface StudentService {

    Map<String,Object> findstudentByPage(Integer page, Integer limit);
}
