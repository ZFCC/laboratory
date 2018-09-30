package com.zky.laboratory.controller;

import com.alibaba.fastjson.JSONObject;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.zky.laboratory.entry.Teacher;
import com.zky.laboratory.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TeacherController {
    @Resource
    TeacherService teacherService;

    @RequestMapping("/nihao")
    @ResponseBody
    public Teacher teacher(HttpServletRequest request, Model model){
       Teacher teacher =  teacherService.findAllTeacher("你好");
        return teacher;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public int insertTeacher(HttpServletRequest request){
        Teacher teacher = new Teacher();
        teacher.setName("赵老师");
        teacher.setTittle("教授");
        teacher.setAddress("b");
        teacher.setBirthday(new Date());
        teacher.setEducation("博士");
        teacher.setPhone("1909999999");
        teacher.setOrganization("中科院");
        teacher.setSex(1);
        teacher.setSubject("动物研究");

        return teacherService.insertTeacher(teacher);
    }
    @RequestMapping("/updateTeacehr")
    @ResponseBody
    public int updateTeacher(){
        Date date1 = null;
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date1 = dateFormat.parse("1980-08-08");
        } catch (ParseException e) {
            e.printStackTrace();
        }
            Teacher teacher = new Teacher();
            teacher.setTeacherId(1);
            teacher.setBirthday(date1);
            teacher.setName("王北大");
            teacher.setPhone("18823457890");
            teacher.setOrganization("北京大学计算机学院");
            teacher.setAddress("北京市海淀区海淀黄庄2号北京大学计算机科学与技术学院");
            teacher.setRemark("王教师是一名优秀教师，曾经获得国家一级教学优秀奖在国内外知名期刊上发表很多优秀论文和作品，深受学生爱戴。");
            return teacherService.updateTeacher(teacher);
    }
//@RequestParam("page") Integer pageNum, @RequestParam("limit") Integer pageSize
    @RequestMapping("/selectByPage")
    @ResponseBody
    public String selectTeacherByPage(){
        int pageNum=1;
        int pageSize=10;
        //分页工具类
//        PageHelper.startPage(pageNum-1,pageSize);
        List<Teacher> teacherList = teacherService.selectAll(pageNum,pageSize);

        PageInfo<Teacher> pageInfo = new PageInfo<>(teacherList);
//        JSONObject map = new JSONObject();
        JSONObject map = new JSONObject();

        map.put("code",0);
        map.put("desc","分页查询教师信息");
        map.put("count",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        System.out.println(map.toJSONString());
        return map.toJSONString();

    }
}
