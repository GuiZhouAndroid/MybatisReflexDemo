package com.dhrj.zs.mapper;

import com.dhrj.zs.entity.UserBean;

import java.util.List;

/**
 * created by on 2022/4/22
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-04-22-19:28
 */
public interface UserMapper {

    //查询所有用户信息，同时获取到用户下拥有的角色信息
    List<UserBean> findAllUser();

    //通过用户id查询此用户拥有的角色信息
    List<UserBean> findAllUserByUserId(Integer userId);
}
