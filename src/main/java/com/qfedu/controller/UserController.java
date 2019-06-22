package com.qfedu.controller;


import com.qfedu.pojo.Authority;
import com.qfedu.pojo.Role;
import com.qfedu.pojo.User;
import com.qfedu.service.AuthorityService;
import com.qfedu.service.UserService;
import com.qfedu.utils.GetIpUtils;
import com.qfedu.vo.JsonBean;
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
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private AuthorityService authorityService;
    @Autowired
    private UserService userService;

    //登录
    @RequestMapping("/login.do")
    public String login(String no, String password, HttpServletRequest request) {
        System.out.println("输入的用户名：" + no + "输入的密码：" + password);
        UsernamePasswordToken token = new UsernamePasswordToken(no, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            String ip = GetIpUtils.getIp(request);
            System.out.println("获取的ip地址：" + ip);
            return "redirect:/index.jsp";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "redirect:/login.html";
        }
    }


    //菜单
    @ResponseBody
    @RequestMapping("/usermenu.do")
    public List<Authority> findUserMenuByNo() {
        String no = (String) SecurityUtils.getSubject().getPrincipal();
        System.out.println("拿到的用户名：" + no);
        List<Authority> authorityList = authorityService.findUserMenuByNo(no);
        System.out.println("菜单啊：" + authorityList);
        return authorityList;
    }


    //用户角色展示列表、根据关键字查询
    @ResponseBody
    @RequestMapping("/userall.do")
    public Map<String, Object> findAllByNoAndFg(String no, Integer flag, Integer page, Integer limit) {

        Map<String, Object> map = userService.findAllByNoAndFg(no, flag, page, limit);
        System.out.println("返回页面的json数据：" + map);
        return map;
    }

    //删除用户角色信息
    @RequestMapping("/userdel.do")
    @ResponseBody
    public JsonBean delete(Integer id) {
        userService.deleteById(id);
        return new JsonBean(1, null);
    }

    //查询用户角色信息修改
    @RequestMapping("/roleall.do")
    @ResponseBody
    public List<Role> roleall01() {
        List<Role> roleList = userService.findAllRole();
        return roleList;
    }


    @RequestMapping("/manage.do")
    @ResponseBody
    public List<User> selectm(){
        List<User> users = userService.selectM();
        System.out.println(users+"11111111111111111111");
        return users;
    }



}
