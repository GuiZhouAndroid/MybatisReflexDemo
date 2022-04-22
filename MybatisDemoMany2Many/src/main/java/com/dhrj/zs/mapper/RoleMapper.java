package com.dhrj.zs.mapper;

import com.dhrj.zs.entity.RoleBean;

import java.util.List;

/**
 * created by on 2022/4/22
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-04-22-19:28
 */
public interface RoleMapper {
    //查询所有角色同时获取到每个角色所属的用户信息
    List<RoleBean> findAllRole();

    //通过角色id查询此角色所属的用户信息
    List<RoleBean> findAllRoleByRoleId(Integer roleId);
}
