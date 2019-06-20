package com.qfedu.controller;

import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Controller

public class StaffController {
    @Autowired
    private StaffService staffService;

    //展示员工所有信息
    @RequestMapping("/stafflist.do")
    @ResponseBody
    public JsonBean list(){
        List<Staff> list = staffService.findAll();
        return  new JsonBean(1,null);
    }
    @RequestMapping("/staffall.do")
    @ResponseBody
    public  List<Staff> staffall() {
        List<Staff> list = staffService.findAll();
        return list;
    }
    //分页展示员工信息
    @RequestMapping("/staffpage.do")
    @ResponseBody
    public Map<String, Object> findByPage(Integer page, Integer limit){
        Map<String, Object> map = staffService.findByPage(page, limit);
        return map;
    }
    //删除员工信息
    @RequestMapping("/staffdelete.do")
    @ResponseBody
    public JsonBean del(String no){
        staffService.delStaffById(no);
        return  new JsonBean(1,null);
    }

    //新增学员
    @RequestMapping("staffadd.do")
    public String staffAdd(Staff staInfo){
        System.out.println("新增员工信息："+staInfo);
        staffService.addStaff(staInfo);
        return "redirect:/stafflist.html";

    }

    // 添加员工 编辑 更新员工
    @RequestMapping("/staffupdate.do")
    public String staUpdate(Staff staInfo){
        staffService.updateStaff(staInfo);
        return "redirect:/stafflist.html";
    }
    //圖片寫死
    @RequestMapping("/photoupload.do")
    public JsonBean pic(){
        return null;
    }

}
