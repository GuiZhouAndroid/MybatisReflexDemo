package com.dhrj.zs;

import com.dhrj.zs.entity.Student;
import com.dhrj.zs.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * created by on 2022/4/20
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-04-20-19:10
 */
public class StudentTest {

    private SqlSession sqlSession;

    @Before
    public void firstOpenSqlSession() throws Exception {
        sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession();
    }

    @After
    public void openSession() {
        sqlSession.close();
    }

    @Test
    public void testGetAll() {
        // studentMapper是动态代理对象
        // 根据Mapper接口的方法，动态调用xml映射文件中对应的标签，并执行定义的SQL语句，最终由代理对象返回结果
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println("类型-------------"+studentMapper.getClass());
        List<Student> studentList = studentMapper.getAll();
        studentList.forEach(System.out::println);
    }

    @Test
    public void testSelectById() {
        Student student = sqlSession.getMapper(StudentMapper.class).selectById(15);
        System.out.println(student);
    }

    @Test
    public void testSelectByLikeName() {
        List<Student> studentList = sqlSession.getMapper(StudentMapper.class).selectByLikeName("张");
        studentList.forEach(System.out::println);
    }

    @Test
    public void testSelectByLikeNameGood() {
        List<Student> studentList = sqlSession.getMapper(StudentMapper.class).selectByLikeNameGood("张");
        studentList.forEach(System.out::println);
    }

    @Test
    public void testSelectByLikeColumOrValueGood() {
        List<Student> studentList = sqlSession.getMapper(StudentMapper.class).selectByLikeColumOrValueGood("email","@");
        studentList.forEach(System.out::println);
    }

    @Test
    public void testAddStudent() {
        sqlSession.getMapper(StudentMapper.class).addStudent(new Student("李四","qwe",13));
        sqlSession.commit();
    }

    @Test
    public void testAddStudentBackId() {
        Student student = new Student("李wsdse", "qwe", 13);
        sqlSession.getMapper(StudentMapper.class).addStudentBackId(student);
        System.out.println(student);
        sqlSession.commit();
    }

    @Test
    public void testDeleteById() {
        sqlSession.getMapper(StudentMapper.class).deleteById(16);
        sqlSession.commit();
    }

    @Test
    public void testUpdateStudent() {
        sqlSession.getMapper(StudentMapper.class).updateStudent(new Student(12,"李四","qwe",13));
        sqlSession.commit();
    }

    @Test
    public void testUUID() {
        UUID uuid = UUID.randomUUID();
        System.out.println("ZS"+uuid.toString().replace("-","").substring(22)+System.currentTimeMillis());
    }

    @Test
    public void testGetByConditions() {
        Student student = new Student();
        student.setName("ha");
        student.setEmail("youxiang");
        student.setAge(100);
        List<Student> studentList = sqlSession.getMapper(StudentMapper.class).getByConditions(student);
        studentList.forEach(System.out::println);
    }

    @Test
    public void testUpdateStudentBySet() {
        Student student = new Student();
        student.setId(18);
        student.setEmail("afe");
        sqlSession.getMapper(StudentMapper.class).updateStudentBySet(student);
        sqlSession.commit();
    }

    @Test
    public void testGetUserInfoByIds() {
        List<Student> studentList =  sqlSession.getMapper(StudentMapper.class).getUserInfoByIds(new Integer[]{3,8,9});
        studentList.forEach(System.out::println);
    }

    @Test
    public void testDeleteBatchInfoByIds() {
        int deleteNum =  sqlSession.getMapper(StudentMapper.class).deleteBatchInfoByIds(new Integer[]{3,8,9});
        System.out.println(deleteNum);
        sqlSession.commit();
    }

    @Test
    public void testAddBatchStudent() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("'QWE'", "'QWE'", 1));
        studentList.add(new Student("'ASD'", "'ZXC'", 2));
        studentList.add(new Student("'ZXC'", "'ZXC'", 3));
        int addNum = sqlSession.getMapper(StudentMapper.class).addBatchStudent(studentList);
        System.out.println(addNum);
        sqlSession.commit();
    }

    @Test
    public void testUpdateBatchStudentBySet() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(17, "QWE", "QWE", 1));
        studentList.add(new Student(18, "张松", "ZXC", 2));
        studentList.add(new Student(19, "ZXC", "ZXC", 3));
        int updateNum = sqlSession.getMapper(StudentMapper.class).updateBatchStudentBySet(studentList);
        System.out.println(updateNum);
        sqlSession.commit();
    }
}
