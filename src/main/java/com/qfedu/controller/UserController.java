package com.qfedu.controller;


import com.qfedu.service.UserService;
import com.qfedu.vo.JsonBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public String login(String no,String password){
        System.out.println("输入的用户名："+no+"输入的密码："+password);
        UsernamePasswordToken token = new UsernamePasswordToken(no, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return "redirect:/index.html";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "redirect:/login.html";
        }
    }

    //@RequiresPermissions("user:list")
    @RequestMapping("/test.do")
    public String test(){
        return "redirect:/main.html";
    }
    //@RequiresPermissions("user:sss")
    @RequestMapping("/test2.do")
    public String test2(){
        return "redirect:/main.html";
    }

    @RequestMapping("/userall.do")
    public JsonBean findAllByNoAndFg(String no,Integer flag,Integer page,Integer limit){

        Map<String, Object> map = userService.findAllByNoAndFg(no, flag, page, limit);
        System.out.println("返回页面的json数据："+map);
        return new JsonBean(1,map);
    }

}
