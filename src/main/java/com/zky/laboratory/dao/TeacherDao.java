package com.zky.laboratory.dao;


import com.zky.laboratory.controller.DTO.QueryByPage;
import com.zky.laboratory.controller.DTO.QueryTeacherByPageDTO;
import com.zky.laboratory.entry.Teacher;
import com.zky.laboratory.service.serviceImpl.QueryParam;
import com.zky.laboratory.service.serviceImpl.QueryResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherDao {

    Teacher selectTeacherByName(String name);

    public int insetTeacher(Teacher teacher);

    public int updateTeacher(Teacher teacher);

//    public QueryResult<Teacher> queryTeachersByPage(QueryParam param);

    List<Teacher> selectByPage(QueryTeacherByPageDTO queryTeacherByPageDTO);
}
