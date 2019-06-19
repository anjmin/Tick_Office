package com.qfedu.controller;

import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

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
    //分页展示员工信息
    @RequestMapping("/staffpage.do")
    public Map<String, Object> findByPage(Integer page, Integer limit){
        Map<String, Object> map = staffService.findByPage(page, limit);
        return map;
    }
    //删除员工信息
    @RequestMapping("/staffdelete.do")
    public JsonBean del(String no){
        staffService.delStaffById(no);
        return  new JsonBean(1,null);
    }


}
