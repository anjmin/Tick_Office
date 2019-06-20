package com.qfedu.controller;

import com.qfedu.pojo.Depart;
import com.qfedu.pojo.Staff;
import com.qfedu.service.DepartService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;
import java.util.Map;
@Controller

public class DepartController {

    @Autowired
    private DepartService departService;

    //展示部门所有信息
    @RequestMapping("/departlist.do")
    @ResponseBody
    public JsonBean list(){
        List<Depart> depart = departService.findDepart();
        return  new JsonBean(1,null);
    }


    //分页展示部门信息
    @RequestMapping("/departpage.do")
    @ResponseBody
    public Map<String, Object> findByPage(Integer page, Integer limit){
        Map<String, Object> map = departService.findByPage(page, limit);
        return map;
    }
    //删除部门信息
    @RequestMapping("/departdelete.do")
    @ResponseBody
    public JsonBean del(Integer id){
        departService.delDepById(id);
        return  new JsonBean(1,null);
    }
    //编辑 更新部门
    @RequestMapping("/departupdate.do")
    public String update(Depart dep){
        departService.updateDep(dep);
        return "redirect:/departlist.html";
    }
    @RequestMapping("/departall.do")
    @ResponseBody
    public List<Depart> depAll(){
        List<Depart> depart = departService.findDepart();
        return depart;
    }

    // 添加部门
    @RequestMapping("/departadd.do")

    public String add(Depart dep){
        departService.addDep(dep);
        return "redirect:/departlist.html";
    }

}
