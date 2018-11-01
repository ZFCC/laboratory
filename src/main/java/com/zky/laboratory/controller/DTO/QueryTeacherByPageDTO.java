package com.zky.laboratory.controller.DTO;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright (C), 2002-2018,
 * FileName: queryTeacherByPageDTO
 * Author:  18075555
 * Date: 2018/10/25 16:41.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class QueryTeacherByPageDTO implements Serializable {

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

    //组织
    private  String organization;

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

    @Override
    public String toString() {
        return "QueryTeacherByPageDTO{" +
                "name='" + name + '\'' +
                ", tittle='" + tittle + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", subject='" + subject + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", education='" + education + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }
}
