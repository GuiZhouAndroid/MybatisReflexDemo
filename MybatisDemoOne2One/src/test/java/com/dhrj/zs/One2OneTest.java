package com.dhrj.zs;

import com.dhrj.zs.mapper.ClassMapper;
import com.dhrj.zs.mapper.TeacherMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * created by on 2022/4/20
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-04-20-19:10
 */
public class One2OneTest {

    private SqlSession sqlSession;
    private ClassMapper classMapper;
    private TeacherMapper teacherMapper;

    @Before
    public void openSession() throws IOException {
        sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession();
        classMapper = sqlSession.getMapper(ClassMapper.class);
        teacherMapper = sqlSession.getMapper(TeacherMapper.class);
    }

    @After
    public void closeSession() {
        sqlSession.close();
    }

    @Test
    public void testGetClassAndTerByClassId() {
        System.out.println(classMapper.getClassAndTerByClassId(2));
    }

    @Test
    public void testGetTerAndClassByTerId() {
        System.out.println(teacherMapper.getTerAndClassByTerId(3));
    }
}
