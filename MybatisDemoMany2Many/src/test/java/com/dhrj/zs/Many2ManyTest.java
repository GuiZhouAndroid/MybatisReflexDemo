package com.dhrj.zs;

import com.dhrj.zs.entity.RoleBean;
import com.dhrj.zs.entity.UserBean;
import com.dhrj.zs.mapper.RoleMapper;
import com.dhrj.zs.mapper.UserMapper;
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
    public void testFindAllUser() {
        List<UserBean> userBeanList = userMapper.findAllUser();
        for (UserBean userBean : userBeanList) {
            System.out.println("--------每个用户的信息---------");
            System.out.println(userBean);
            System.out.println(userBean.getRoleBeanList());
        }
    }

    @Test
    public void testFindAllUserByUserId() {
        List<UserBean> userBeanList = userMapper.findAllUserByUserId(2);
        for (UserBean userBean : userBeanList) {
            System.out.println("--------每个用户的信息---------");
            System.out.println(userBean);
            System.out.println(userBean.getRoleBeanList());
        }
    }

    @Test
    public void testFindAllRole() {
        List<RoleBean> roleBeanList = roleMapper.findAllRole();
        for (RoleBean roleBean : roleBeanList) {
            System.out.println("--------每个角色的信息---------");
            System.out.println(roleBean);
            System.out.println(roleBean.getUserBeanList());
        }
    }

    @Test
    public void testFindAllRoleByRoleId() {
        List<RoleBean> roleBeanList = roleMapper.findAllRoleByRoleId(1);
        for (RoleBean roleBean : roleBeanList) {
            System.out.println("--------每个角色的信息---------");
            System.out.println(roleBean);
            System.out.println(roleBean.getUserBeanList());
        }
    }
}
