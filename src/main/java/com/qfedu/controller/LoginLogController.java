package com.qfedu.controller;

import com.qfedu.service.LoginLogService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 2019/6/18 0018.
 */
@Controller
public class LoginLogController {

    @Autowired
    private LoginLogService loginLogService;


    @RequestMapping("/loginloglist.do")
    @ResponseBody
    public Map<String,Object> findLoginLog(){
        String no=(String) SecurityUtils.getSubject().getPrincipal();
        System.out.println("拿到的用户名："+no+"登录记录");
        Map<String, Object> map = loginLogService.findLoginLog(no);
        System.out.println("后台传来的根据用户名查询的登录信息"+map);
        return map;
    }

}
