package com.zky.laboratory.controller.userManageController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.github.pagehelper.PageInfo;

import com.zky.laboratory.controller.DTO.QueryTeacherByPageDTO;
import com.zky.laboratory.Utils.FileUploadUtils;
import com.zky.laboratory.Utils.StringUtils;
import com.zky.laboratory.controller.dto.FileUploadeDTO;
import com.zky.laboratory.entry.Teacher;
import com.zky.laboratory.service.TeacherService;

import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    TeacherService teacherService;

    @Resource
    ResourceLoader resourceLoader1;

   /* private final ResourceLoader resourceLoader;
    @Autowired
    public TeacherController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }*/
    @RequestMapping("/insert")
    @ResponseBody
    public int insertTeacher(HttpServletRequest request){
        Teacher teacher = new Teacher();
        teacher.setName("赵老师");
        teacher.setTittle("教授");
        teacher.setAddress("b");
        teacher.setBirthday(new Date());
        teacher.setEducation("博士");
        teacher.setPhone("13063332778");
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
    @RequestMapping("/selectByPage")
    @ResponseBody
    public String selectTeacherByPage(QueryTeacherByPageDTO queryTeacherByPageDTO
                                      ){
        List<Teacher> teacherList = null;
        try {
            teacherList = teacherService.selectByPage(queryTeacherByPageDTO);
        }catch (Exception e){
            e.printStackTrace();
        }
        //分页工具类
        PageInfo<Teacher> pageInfo = new PageInfo<>(teacherList);
//        JSONObject map = new JSONObject();
        JSONObject map = new JSONObject();
        map.put("code","success");
        map.put("desc","分页查询教师信息");
        map.put("count",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        map.put("pageSize",pageInfo.getPageSize());
        map.put("pageNum", pageInfo.getPageNum());
        System.out.println(map.toJSONString());
        return map.toJSONString();
    }


    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {

        Map<String ,String> map = new HashMap<>();
        if (file.isEmpty()){
            map.put("desc","file is empty");
            return  JSON.toJSONString(map);
        }
        //文件名
        String fileName = file.getOriginalFilename();
        //上传文件路径
        String realFilePath = "E:/Develop/Files/Photos";
        //调用文件上传方法，返回文件路径
        String filePath = FileUploadUtils.uploadPhoto(file, realFilePath, fileName);

        FileUploadeDTO fileUploadeDTO = new FileUploadeDTO();
        fileUploadeDTO.setFileName(fileName);
        fileUploadeDTO.setFilePath(filePath);
        fileUploadeDTO.setUserName("李老师");
        fileUploadeDTO.setUserNumber("123");

        int res = teacherService.photoUploade(fileUploadeDTO);
        if (res>0){
            map.put("desc",filePath);
            JSON.toJSONString(map);
            return JSON.toJSONString(map);
        }
        map.put("desc","uploade photo failed");
        return  JSON.toJSONString(map);
    }
    @RequestMapping("/showPhoto")
    @ResponseBody
    public ResponseEntity showPhoto(int id){

        if (StringUtils.isEmpty(String.valueOf(id))){
            ResponseEntity.ok(null);
        }

        FileUploadeDTO fileUploadeDTO = teacherService.getPhotoByNumber(id);

        if (fileUploadeDTO == null){
            ResponseEntity.ok(null);
        }
        //由于是读取本机的文件，file一定要加上
        return ResponseEntity.ok(resourceLoader1.getResource("file:"+fileUploadeDTO.getFilePath()));
    }

    public static void main(String ags[]){
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isNotEmpty(""));
        System.out.println(StringUtils.leftPad("123123"));

        String str = "2018-10-21 09:10:10.0";
        str.substring(0,str.length()-2);
        System.out.println(str.substring(0,str.length()-2));
    }
}
