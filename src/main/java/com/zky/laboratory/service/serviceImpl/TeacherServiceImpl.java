package com.zky.laboratory.service.serviceImpl;


import com.zky.laboratory.dao.TeacherDao;
import com.zky.laboratory.entry.Teacher;
import com.zky.laboratory.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.regex.Matcher;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    @Resource
    TeacherDao teacherDao;

    @Override
    public Teacher findAllTeacher(String name) {
        return teacherDao.selectTeacherByName(name);
    }

    @Override
    public int insertTeacher(Teacher teacher) {
        String phone = teacher.getPhone();
        //插入姓名不能为空
        if (teacher.getName() == null){
            return 0;
        }
        //校验手机号码是否合法,不合法就直接返回0，合法进行插入
        if (!valuedateNumber(phone)){
            return 0;
        }
        return teacherDao.insetTeacher(teacher);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        String phone = teacher.getPhone();
        //校验手机号码是否合法,不合法就直接返回0，合法进行更新
        if (!valuedateNumber(phone)){
            return 0;
        }

        return teacherDao.updateTeacher(teacher);
    }

    @Override
    public List<Teacher> selectAll(Integer pageNum, Integer pageSize) {
        return teacherDao.selectAll();
    }


    public boolean valuedateNumber(String string){
//        Matcher matcher = new Matcher();
        String telRegex = "[1][3578]\\d{9}";
        return string.matches(telRegex);
    }
}
