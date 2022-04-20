package com.dhrj.zs.mapper;

import com.dhrj.zs.entity.Student;

import java.util.List;

/**
 * created by on 2022/4/20
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-04-20-19:00
 */
public interface StudentMapper {

    List<Student> getAll();

    Student selectById(int id);

    List<Student> selectByLikeName(String lineName);

    List<Student> selectByLikeNameGood(String lineName);

    int addStudent(Student student);

    int deleteById(int id);

    int updateStudent(Student student);

}
