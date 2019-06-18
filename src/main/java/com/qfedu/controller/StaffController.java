package com.qfedu.controller;

import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class StaffController {
    @Autowired
    private StaffService staffService;

    //展示员工所有信息
    @RequestMapping("/list.do")
    public JsonBean list(){
        List<Staff> list = staffService.findAll();
        return  new JsonBean(1,null);
    }

}
