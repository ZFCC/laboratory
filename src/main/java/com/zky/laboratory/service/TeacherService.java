package com.zky.laboratory.service;

import com.zky.laboratory.controller.dto.FileUploadeDTO;
import com.zky.laboratory.controller.dto.QueryTeacherByPageDTO;
import com.zky.laboratory.entry.Teacher;

import java.util.List;

public interface TeacherService {
    public Teacher findAllTeacher(String name);

    public int insertTeacher(Teacher teacher);

    public  int updateTeacher(Teacher teacher);

    public List<Teacher> selectByPage(QueryTeacherByPageDTO queryTeacherByPageDTO);

    public int photoUploade(FileUploadeDTO fileUploadeDTO);

    public FileUploadeDTO getPhotoByNumber(int id);
}
