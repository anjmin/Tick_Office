package com.qfedu.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Process {
    //序号
    private Integer id;
    //备注信息
    private String info;
    //类型
    private String type;
    //发起人
    private String startname;
    //工号
    private String startno;
    //起始日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startdate;
    //截止日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date enddate;
    //天数
    private Integer days;
    //流程序号
    private Integer pid;
    //结果
    private Integer flag;
    //审批人的Id
    private  Integer ManageId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartname() {
        return startname;
    }

    public void setStartname(String startname) {
        this.startname = startname;
    }

    public String getStartno() {
        return startno;
    }

    public void setStartno(String startno) {
        this.startno = startno;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getManageId() {
        return ManageId;
    }

    public void setManageId(Integer manageId) {
        ManageId = manageId;
    }

    @Override
    public String toString() {
        return "Process{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", type='" + type + '\'' +
                ", startname='" + startname + '\'' +
                ", startno='" + startno + '\'' +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", days=" + days +
                ", pid=" + pid +
                ", flag=" + flag +
                ", ManageId=" + ManageId +
                '}';
    }
}
