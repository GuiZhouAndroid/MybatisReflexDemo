package com.dhrj.zs.mapper;

import com.dhrj.zs.entity.Student;
import org.apache.ibatis.annotations.Param;

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

    Student selectById(Integer id);

    List<Student> selectByLikeName(String lineName);

    List<Student> selectByLikeNameGood(String name);

    List<Student> selectByLikeColumOrValueGood(@Param("column") String column,@Param("value")String value);

    int addStudent(Student student);

    int addStudentBackId(Student student);

    int deleteById(int id);

    int updateStudent(Student student);

    //按指定的条件进行多条件查询
    List<Student> getByConditions(Student student);

    //有选择更新
    int updateStudentBySet(Student student);

    //查询多个指定id用户的信息
    List<Student> getUserInfoByIds(Integer[] arrayIds);

    //根据多个指定id批量删除用户信息
    int deleteBatchInfoByIds(Integer[] arrayIds);

    //批量添加信息
    int addBatchStudent(List<Student> studentList);

    //批量有选择更新信息
    int updateBatchStudentBySet(List<Student> studentList);
}
