package com.zky.laboratory.service.serviceImpl;


import com.zky.laboratory.Utils.StringUtils;
import com.zky.laboratory.controller.dto.FileUploadeDTO;
import com.zky.laboratory.controller.DTO.QueryTeacherByPageDTO;
import com.zky.laboratory.dao.FileUploadeDao;
import com.zky.laboratory.dao.TeacherDao;
import com.zky.laboratory.entry.Teacher;
import com.zky.laboratory.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    @Resource
    TeacherDao teacherDao;

    @Resource
    FileUploadeDao fileUploadeDao;

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
        if (!StringUtils.validateTelNumber(phone)){
            return 0;
        }
        return teacherDao.insetTeacher(teacher);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        String phone = teacher.getPhone();
        //校验手机号码是否合法,不合法就直接返回0，合法进行更新
        if (!StringUtils.validateTelNumber(phone)){
            return 0;
        }
        return teacherDao.updateTeacher(teacher);
    }

    @Override
    public List<Teacher> selectByPage(QueryTeacherByPageDTO queryTeacherByPageDTO) {
        return teacherDao.selectByPage(queryTeacherByPageDTO);
    }

    @Override
    public int photoUploade(FileUploadeDTO fileUploadeDTO) {
        return fileUploadeDao.photoUploade(fileUploadeDTO);
    }

    @Override
    public FileUploadeDTO getPhotoByNumber(int id) {
        return fileUploadeDao.getPhotoByUserNumber(id);
    }


}
