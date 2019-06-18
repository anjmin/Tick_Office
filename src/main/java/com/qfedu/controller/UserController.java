package com.qfedu.controller;


import com.qfedu.pojo.Authority;
import com.qfedu.service.AuthorityService;
import com.qfedu.utils.GetIpUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private AuthorityService authorityService;

    //登录
    @RequestMapping("/login.do")
    public String login(String no, String password,HttpServletRequest request){
        System.out.println("输入的用户名："+no+"输入的密码："+password);
        UsernamePasswordToken token = new UsernamePasswordToken(no, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            String ip = GetIpUtils.getIp(request);
            System.out.println("获取的ip地址："+ip);
            return "redirect:/index.jsp";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "redirect:/login.html";
        }
    }



    //菜单
    @ResponseBody
    @RequestMapping("/usermenu.do")
    public  List<Authority> findUserMenuByNo( ){
        String no=(String)SecurityUtils.getSubject().getPrincipal();
        System.out.println("拿到的用户名："+no);
       List<Authority> authorityList=authorityService.findUserMenuByNo(no);
        return authorityList;
    }





}
