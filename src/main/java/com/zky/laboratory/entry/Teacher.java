package com.zky.laboratory.entry;

import javax.persistence.Column;
import java.util.Date;

public class Teacher {

    //教师编号
    @Column(name = "teacher_id")
    private int teacherId;

    //姓名
    private String name;

    //职称
    private String tittle;

    //性别
    private int sex;

    //生日
    private Date birthday;

    //课题
    private String subject;

    //电话
    private String phone;

    //地址
    private  String address;

    //学历
    private String education;

    private  String organization;

    private String remark;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", tittle='" + tittle + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", subject='" + subject + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", education='" + education + '\'' +
                ", organization='" + organization + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
