package com.qfedu.service;

import com.qfedu.pojo.Process;

import java.util.List;
import java.util.Map;

public interface ProcessSercive {
    //展示信息
    public List<Process> selectAllInfo();
    //分页
    public Map<String,Object> findByPage(Integer page, Integer limit);
}
