package com.zky.laboratory.entry;

import java.io.Serializable;
import java.util.Date;

public class Achievement implements Serializable{

    private int articleId;

    private String title;

    private String authors;

    private Date publishDate;

    private String press;

    private int type;

    private String abst;

    private Date sendTime;

    private int teacherId;

    private int studentId;

    private String voucherNumber;

    private String issue;

    private  String dio;


    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAbst() {
        return abst;
    }

    public void setAbst(String abst) {
        this.abst = abst;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getDio() {
        return dio;
    }

    public void setDio(String dio) {
        this.dio = dio;
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "articleId=" + articleId +
                ", title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", publishDate=" + publishDate +
                ", press='" + press + '\'' +
                ", type=" + type +
                ", abst='" + abst + '\'' +
                ", sendTime=" + sendTime +
                ", teacherId=" + teacherId +
                ", studentId=" + studentId +
                ", voucherNumber='" + voucherNumber + '\'' +
                ", issue='" + issue + '\'' +
                ", dio='" + dio + '\'' +
                '}';
    }
}
