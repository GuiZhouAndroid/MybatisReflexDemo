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
import java.util.Map;
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


    private StudentMapper studentMapper;

    @Before
    public void firstOpenSqlSession() throws Exception {
        sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession();
        studentMapper = sqlSession.getMapper(StudentMapper.class);
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
        Student student = studentMapper.selectById(15);
        System.out.println(student);
    }

    @Test
    public void testSelectByLikeName() {
        List<Student> studentList = studentMapper.selectByLikeName("张");
        studentList.forEach(System.out::println);
    }

    @Test
    public void testSelectByLikeNameGood() {
        List<Student> studentList = studentMapper.selectByLikeNameGood("张");
        studentList.forEach(System.out::println);
    }

    @Test
    public void testSelectByLikeColumOrValueGood() {
        List<Student> studentList = studentMapper.selectByLikeColumOrValueGood("email","@");
        studentList.forEach(System.out::println);
    }

    @Test
    public void testAddStudent() {
        studentMapper.addStudent(new Student("李四","qwe",13));
        sqlSession.commit();
    }

    @Test
    public void testAddStudentBackId() {
        Student student = new Student("李wsdse", "qwe", 13);
        studentMapper.addStudentBackId(student);
        System.out.println(student);
        sqlSession.commit();
    }

    @Test
    public void testDeleteById() {
        studentMapper.deleteById(16);
        sqlSession.commit();
    }

    @Test
    public void testUpdateStudent() {
        studentMapper.updateStudent(new Student(12,"李四","qwe",13));
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
        List<Student> studentList = studentMapper.getByConditions(student);
        studentList.forEach(System.out::println);
    }

    @Test
    public void testUpdateStudentBySet() {
        Student student = new Student();
        student.setId(18);
        student.setEmail("afe");
        studentMapper.updateStudentBySet(student);
        sqlSession.commit();
    }

    @Test
    public void testGetUserInfoByIds() {
        List<Student> studentList = studentMapper.getUserInfoByIds(new Integer[]{3,8,9});
        studentList.forEach(System.out::println);
    }

    @Test
    public void testDeleteBatchInfoByIds() {
        int deleteNum =  studentMapper.deleteBatchInfoByIds(new Integer[]{3,8,9});
        System.out.println(deleteNum);
        sqlSession.commit();
    }

    @Test
    public void testAddBatchStudent() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("'QWE'", "'QWE'", 1));
        studentList.add(new Student("'ASD'", "'ZXC'", 2));
        studentList.add(new Student("'ZXC'", "'ZXC'", 3));
        int addNum = studentMapper.addBatchStudent(studentList);
        System.out.println(addNum);
        sqlSession.commit();
    }

    @Test
    public void testUpdateBatchStudentBySet() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(17, "QWE", "QWE", 1));
        studentList.add(new Student(18, "张松", "ZXC", 2));
        studentList.add(new Student(19, "ZXC", "ZXC", 3));
        int updateNum = studentMapper.updateBatchStudentBySet(studentList);
        System.out.println(updateNum);
        sqlSession.commit();
    }

    @Test
    public void testGetOneMapById() {
        Map map = studentMapper.getOneMapById(1);
        System.out.println(map.get("name"));//根据[字段名]提取
        System.out.println(map.get("a"));//根据[字段别名]提取
        System.out.println(map);
    }

    @Test
    public void testGetMoreMap() {
        List<Map> mapList = studentMapper.getMoreMap();
        mapList.forEach(System.out::println);
        //System.out.println(mapList);
    }

    @Test
    public void testGetMoreMapByResultMap() {
        List<Student> mapList = studentMapper.getMoreMapByResultMap();
        mapList.forEach(System.out::println);
        //System.out.println(mapList);
    }
}
