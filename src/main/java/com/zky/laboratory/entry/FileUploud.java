package com.zky.laboratory.entry;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright (C), 2002-2018,
 * FileName: FileUploud
 * Author:  18075555
 * Date: 2018/10/31 14:34.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class FileUploud implements Serializable {
    private int id;
    //姓名
    private String userName;
    //路径
    private String path;
    //文件名
    private String fileName;
    //上传时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    //标记
    private String remark;
    //用户编码
    private String number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "FileUploud{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", path='" + path + '\'' +
                ", fileName='" + fileName + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
