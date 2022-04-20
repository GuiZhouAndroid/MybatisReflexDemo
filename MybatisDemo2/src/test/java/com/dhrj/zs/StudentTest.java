package com.dhrj.zs;

import com.dhrj.zs.entity.Student;
import com.dhrj.zs.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println("类型-------------"+studentMapper.getClass());
        List<Student> studentList = studentMapper.getAll();
        studentList.forEach(System.out::println);
    }
}
