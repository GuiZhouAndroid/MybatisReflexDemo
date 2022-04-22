package com.dhrj.zs.entity;

import java.util.List;

/**
 * created by on 2022/4/22
 * 描述：客户实体类
 * 一对多：一方持有多方的集合 ，一方对应标签<association></association>，多方对比标签<resultMap></resultMap>
 *
 * @author ZSAndroid
 * @create 2022-04-22-11:45
 */
public class CustomerBean {
    private Integer id;
    private String name;
    private Integer age;

    private List<OrdersBean> ordersBeanList;

    public CustomerBean() {
    }

    public CustomerBean(String name, Integer age, List<OrdersBean> ordersBeanList) {
        this.name = name;
        this.age = age;
        this.ordersBeanList = ordersBeanList;
    }

    public CustomerBean(Integer id, String name, Integer age, List<OrdersBean> ordersBeanList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ordersBeanList = ordersBeanList;
    }

    @Override
    public String toString() {
        return "CustomerBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", ordersBeanList=" + ordersBeanList +
                '}';
    }
}
