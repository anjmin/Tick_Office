package com.qfedu.pojo;

import java.util.Date;

public class Staff {

    //工号
    private String no;
    //员工名称
    private String name;
    // 所属部门
    private Integer did;
    // 当前状态
    private Integer flag;
    // 性别
    private String sex;
    // 邮箱
    private String email;
    // QQ
    private String qq;
    // 手机号
    private String phone;
    // 入职日期
    private Date createdate;
    // 图片
    private String photo;

    private Depart depart;

    private  String dname;

    public String getDname() {
        return depart.getName();
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

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

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public Depart getDepart() {
        return depart;
    }

    public void setDepart(Depart depart) {
        this.depart = depart;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", did=" + did +
                ", flag=" + flag +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", phone='" + phone + '\'' +
                ", createdate=" + createdate +
                ", photo='" + photo + '\'' +
                ", depart=" + depart +
                '}';
    }
}
