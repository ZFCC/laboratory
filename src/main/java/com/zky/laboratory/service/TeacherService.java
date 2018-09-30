package com.zky.laboratory.service;

import com.zky.laboratory.entry.Teacher;

import java.util.List;

public interface TeacherService {
    public Teacher findAllTeacher(String name);

    public int insertTeacher(Teacher teacher);

    public  int updateTeacher(Teacher teacher);

    public List<Teacher> selectAll(Integer pageNum, Integer pageSize);
}
