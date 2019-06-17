package com.qfedu.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
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

}
