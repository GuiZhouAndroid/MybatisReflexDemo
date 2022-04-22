package com.dhrj.zs.entity;

import java.util.List;

/**
 * created by on 2022/4/22
 * 描述：用户实体类：当我们查询用户信息时，可以同时得到用户所包含的角色信息
 *
 * @author ZSAndroid
 * @create 2022-04-22-19:26
 */
public class UserBean {

    private Integer userId;
    private String username;
    private String address;

    //多对多的关系映射，一个用户可以具备多个角色
    private List<RoleBean> roleBeanList;

    public UserBean() {
    }

    public UserBean(String username, String address, List<RoleBean> roleBeanList) {
        this.username = username;
        this.address = address;
        this.roleBeanList = roleBeanList;
    }

    public UserBean(Integer userId, String username, String address, List<RoleBean> roleBeanList) {
        this.userId = userId;
        this.username = username;
        this.address = address;
        this.roleBeanList = roleBeanList;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<RoleBean> getRoleBeanList() {
        return roleBeanList;
    }

    public void setRoleBeanList(List<RoleBean> roleBeanList) {
        this.roleBeanList = roleBeanList;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", roleBeanList=" + roleBeanList +
                '}';
    }
}
