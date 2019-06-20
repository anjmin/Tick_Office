package com.qfedu.controller;



import com.qfedu.pojo.Authority;
import com.qfedu.service.AuthorityService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 2019/6/20.
 */
@Controller
public class AuthorityConroller {

    @Autowired
    private AuthorityService authorityService;


    //查询展示所有权限
    @RequestMapping("/authoritylist.do")
    @ResponseBody
    public Map<String, Object> findAllAuth(Integer page, Integer limit){
        Map<String, Object> map = authorityService.findAllAuth(page, limit);
        return map;
    }

    //添加权限
    @RequestMapping("/authorityadd.do")
    @ResponseBody
    public JsonBean addAuth(String title,String icon,String aurl,Integer pid){
        Authority auth = new Authority();
        auth.setTitle(title);
        auth.setIcon(icon);
        auth.setAurl(aurl);
        auth.setParentId(pid);
        System.out.println("页面表单提交的新增权限信息："+auth);
        authorityService.addAuth(auth);
        return new JsonBean(1,null);
    }
}
