package com.qfedu.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login.do")
    public String login(String no,String password){

        UsernamePasswordToken token = new UsernamePasswordToken(no, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return "redirect:/main.html";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "redirect:/login.html";
        }
    }

}
