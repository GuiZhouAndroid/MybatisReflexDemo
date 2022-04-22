package com.dhrj.zs.entity;

/**
 * created by on 2022/4/22
 * 描述：班级实体类
 * 一对一：一方持有另外一方对象，一方对应标签<association></association>
 *
 * @author ZSAndroid
 * @create 2022-04-22-16:13
 */
public class ClassBean {
    private Integer id;
    private String name;
    private TeacherBean teacherBean;

    public ClassBean() {
    }

    public ClassBean(String name, TeacherBean teacherBean) {
        this.name = name;
        this.teacherBean = teacherBean;
    }

    public ClassBean(Integer id, String name, TeacherBean teacherBean) {
        this.id = id;
        this.name = name;
        this.teacherBean = teacherBean;
    }

    @Override
    public String toString() {
        return "ClassBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacherBean=" + teacherBean +
                '}';
    }
}
