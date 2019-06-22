package com.qfedu.controller;

import com.qfedu.pojo.Authority;
import com.qfedu.service.RoleService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/19.
 */
@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    //查看所有角色、根据关键字查询
    @RequestMapping("/rolepage.do")
    @ResponseBody
    public Map<String, Object> rolepage(String info) {
        System.out.println(info);
        Map<String, Object> map = roleService.rolepage(info);;
        System.out.println("返回角色页面的json数据：" + map);
        return map;
    }


    //删除角色信息
    @RequestMapping("/roleDel.do")
    @ResponseBody
    public JsonBean delete(Integer id) {
        roleService.deleteById(id);
        return new JsonBean(1, null);
    }

    //编辑先查看信息
    @RequestMapping("/roleall2.do")
    @ResponseBody
    public List<Authority> roleall02(){
        List<Authority> authorityList = roleService.findAllAuthority();
        return authorityList;
    }


    //修改角色权限
    @RequestMapping("/roleedit.do")
    @ResponseBody
    public JsonBean userRoleEdit(Integer id,Integer[] aids){
        roleService.userRoleEdit(id,aids);
        return new JsonBean(1, null);
    }

}
