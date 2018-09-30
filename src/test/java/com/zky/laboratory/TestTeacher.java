//package com.zky.laboratory;
//
//
//import com.zky.laboratory.dao.TeacherDao;
//import com.zky.laboratory.entry.Teacher;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TestTeacher {
//
//    @Autowired
//    TeacherDao teacherDao;
//
//    @Test
//    public void testInsertTeacher(){
//        Teacher teacher = new Teacher();
//        teacher.setName("zhaofuy");
//        teacher.setTittle("教授");
//        teacherDao.insetTeacher(teacher);
//        Assert.assertEquals(1,teacherDao.findAll().size());
//    }
//}
