package com.qfedu.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class Student {
    //学号
    private String no;
    //姓名
    private String name;
    //性别
    private String sex;
    //生日
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    //身份证号
    private String cardno;
    //学校
    private String school;
    //学历
    private String education;
    //班级序号
    private Integer gid;
    //标记位
    private Integer flag;
    //邮箱
    private String email;
    //qq
    private String qq;
    //电话
    private String phone;
    //介绍人工号或学号
    private String introno;
    //入学日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdate;
    //照片
    private String photo;
   /* //嵌套班级对象
    private Grade grade;*/

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIntrono() {
        return introno;
    }

    public void setIntrono(String introno) {
        this.introno = introno;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


    @Override
    public String toString() {
        return "Student{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", cardno='" + cardno + '\'' +
                ", school='" + school + '\'' +
                ", education='" + education + '\'' +
                ", gid=" + gid +
                ", flag=" + flag +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", phone='" + phone + '\'' +
                ", introno='" + introno + '\'' +
                ", createdate=" + createdate +
                ", photo='" + photo + '\'' +
                '}';
    }
}
