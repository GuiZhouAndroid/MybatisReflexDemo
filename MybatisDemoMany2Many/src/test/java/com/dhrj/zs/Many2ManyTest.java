package com.dhrj.zs;

import com.dhrj.zs.mapper.RoleMapper;
import com.dhrj.zs.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * created by on 2022/4/20
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-04-20-19:10
 */
public class Many2ManyTest {

    private SqlSession sqlSession;

    private UserMapper userMapper;
    private RoleMapper roleMapper;
    @Before
    public void firstOpenSqlSession() throws Exception {
        sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
        roleMapper = sqlSession.getMapper(RoleMapper.class);
    }

    @After
    public void openSession() {
        sqlSession.close();
    }

    @Test
    public void testGetCusOrdersByUserId() {
        //System.out.println(customerMapper.getCusOrdersByUserId(2));
    }

    @Test
    public void testGetOrdersOfCustomerByOrdersId() {
        //System.out.println(ordersMapper.getOrdersOfCustomerByOrdersId(1));
    }
}
