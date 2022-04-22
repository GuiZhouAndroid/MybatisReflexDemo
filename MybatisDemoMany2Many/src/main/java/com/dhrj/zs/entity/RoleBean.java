package com.dhrj.zs.entity;

import java.util.List;

/**
 * created by on 2022/4/22
 * 描述：角色实体类
 * 当我们查询角色时，可以同时得到角色的所赋予的用户信息
 * 分析：查询角色我们需要用到Role表
 * 但角色分配的用户信息我们并不能直接找到用户信息，而是要通过中间表(user_role表)才能关联到用户信息
 *
 * @author ZSAndroid
 * @create 2022-04-22-19:26
 */
public class RoleBean {

    private Integer roleId;
    private String roleName;
    private String roleDescribe;
    //多对多的关系映射,一个角色可以赋予多个用户
    private List<UserBean> userBeanList;

    public RoleBean() {
    }

    public RoleBean(String roleName, String roleDescribe, List<UserBean> userBeanList) {
        this.roleName = roleName;
        this.roleDescribe = roleDescribe;
        this.userBeanList = userBeanList;
    }

    public RoleBean(Integer roleId, String roleName, String roleDescribe, List<UserBean> userBeanList) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDescribe = roleDescribe;
        this.userBeanList = userBeanList;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe;
    }

    public List<UserBean> getUserBeanList() {
        return userBeanList;
    }

    public void setUserBeanList(List<UserBean> userBeanList) {
        this.userBeanList = userBeanList;
    }

    @Override
    public String toString() {
        return "RoleBean{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleDescribe='" + roleDescribe + '\'' +
                ", userBeanList=" + userBeanList +
                '}';
    }
}
