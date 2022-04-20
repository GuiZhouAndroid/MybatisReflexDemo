package org.dhrj.zs;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.dhrj.zs.entity.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * created by on 2022/4/19
 * 描述：学生表测试类 --- 单表CRUD
 *
 * @author ZSAndroid
 * @create 2022-04-19-20:55
 */
public class StudentTest {

    private SqlSession sqlSession;

    @Before
    public void firstOpenSqlSession() throws IOException {
        //自动提交事务：openSession(true);
        sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession();
    }

    @After
    public void closeSqlSession() {
        sqlSession.close();
    }

    /**
     * 查询全部学生信息
     */
    @Test
    public void testGetAll() throws Exception {
        //1.使用文件流读取核心配置文件sqlMapConfig. xml
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建sqlsessionFactory工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.取出sqlsession的对象
        SqlSession sqlSession = sessionFactory.openSession();
        //4.完成查询操作
        List<Student> studentList = sqlSession.selectList("baoming.getAll");
        studentList.forEach(System.out::println);
        //5.关闭sqlsession
        sqlSession.close();
    }

    /**
     * 通过学生ID查询对应学生信息
     */
    @Test
    public void testGetById() {
        System.out.println(sqlSession.selectOne("baoming.getById", 11).toString());
    }

    /**
     * 通过学生姓名执行模糊查询
     */
    @Test
    public void testGetByLikeName() {
        List<Student> studentList = sqlSession.selectList("baoming.getByLikeName", "张松1");
        studentList.forEach(System.out::println);
    }

    /**
     * 添加学生信息
     */
    @Test
    public void testAddStudent() {
        sqlSession.insert("baoming.addStudent", new Student("张松1", "2323@qq.com", 50));
        sqlSession.commit();//手动提交事务
    }

    /**
     * 通过学生ID删除对应学生信息
     */
    @Test
    public void testDeleteById() {
        sqlSession.delete("baoming.deleteById", 11);
        sqlSession.commit();//手动提交事务
    }

    /**
     * 通过学生ID更新对应学生信息
     */
    @Test
    public void tesUpdateStudent() {
        sqlSession.update("baoming.updateStudent", new Student(10, "haha", "youxiang", 100));
        sqlSession.commit();//手动提交事务
    }
}
