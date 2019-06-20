package com.qfedu.controller;

import com.qfedu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 2019/6/19.
 */
@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;


    //查看所有角色
    @RequestMapping("/rolepage.do")
    @ResponseBody
    public Map<String, Object> findRoleAll(){
        Map<String, Object> map = roleService.findRoleAll();
        return map;
    }

}