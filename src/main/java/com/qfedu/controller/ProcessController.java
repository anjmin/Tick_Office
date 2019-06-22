package com.qfedu.controller;

import com.qfedu.pojo.Process;
import com.qfedu.service.ProcessSercive;
import com.qfedu.service.UserService;
import com.qfedu.vo.JsonBean;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Controller
public class ProcessController {
    @Autowired
    private ProcessSercive processSercive;
    @Autowired
    private UserService userService;

    //展示信息
    @RequestMapping("/list.do")
    @ResponseBody
    public JsonBean list(String startno){
        List<Process> list = processSercive.selectAllInfo(startno);
        return  new JsonBean(1,null);
    }
    //分页我的记录
    @RequestMapping("/processlist.do")
    @ResponseBody
    public Map<String, Object> findByPage(Integer page, Integer limit){

        String startno = (String) SecurityUtils.getSubject().getPrincipal();
        Map<String, Object> map = processSercive.findByPage(page, limit,startno);

        return map;
    }

    //取消
    @ResponseBody
    @RequestMapping("/processdel.do")
    public JsonBean del(Integer id){
        processSercive.Undo(id);
        return new JsonBean(1,null);
    }
    //add
    @RequestMapping("processadd.do")
    public String staffAdd(Process process){
        String startno=(String) SecurityUtils.getSubject().getPrincipal();
        String startname=userService.selectUserName(startno);
        Random random=new Random();
        Integer i=random.nextInt(1000);
        process.setStartname(startname);
        process.setStartno(startno);
        process.setPid(i);
        process.setFlag(1);
        System.out.println(process);
        processSercive.addInfo(process);
        return "redirect:/processlist.html";

    }
    //统计
    @ResponseBody
    @RequestMapping("processecharts.do")
    public List<Process> processecharts(String  pid,Process process){
        List<Process> byPid = processSercive.selectByPid(pid);
        process.getId();
        process.getStartdate();
        return  byPid;

    }

   /* //统计
    @ResponseBody
    @RequestMapping("processecharts.do")
    public Map<String, Object> processecharts(Integer  pid){
        Map<String, Object> map = processSercive.selectByPid2(pid);
        System.out.println("echarts要的数据："+map+"eeeeeeeeeeeeeeeeeeeee");
        return  map;

    }*/

    @ResponseBody
    @RequestMapping("/processupdate.do")
    public Map<String,Object> processupdate(Integer id,Integer flag){
        Map map=new HashMap();
        map.put("id",id);
        map.put("flag",flag);
        return processSercive.processupdate(map);
    }

    @ResponseBody
    @RequestMapping("/processnolist.do")
    public Map<String,Object> processnolist(Integer page,Integer limit){
        String startno=(String) SecurityUtils.getSubject().getPrincipal();
        Integer checkId=userService.findUserId(startno);
        return  processSercive.processnolist(page,limit,checkId);
    }


}
