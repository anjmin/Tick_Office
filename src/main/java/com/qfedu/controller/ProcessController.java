package com.qfedu.controller;

import com.qfedu.pojo.Process;
import com.qfedu.service.ProcessSercive;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ProcessController {
    @Autowired
    private ProcessSercive processSercive;

    //展示员工所有信息
    @RequestMapping("/list.do")
    @ResponseBody
    public JsonBean list(String name){
        List<Process> list = processSercive.selectAllInfo();
        return  new JsonBean(1,null);
    }
    //分页展示员工信息
    @RequestMapping("/processlist.do")
    @ResponseBody
    public Map<String, Object> findByPage(Integer page, Integer limit){
        Map<String, Object> map = processSercive.findByPage(page, limit);
        return map;
    }

}
