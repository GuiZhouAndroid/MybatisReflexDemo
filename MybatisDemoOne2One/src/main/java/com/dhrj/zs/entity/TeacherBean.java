package com.dhrj.zs.entity;

/**
 * created by on 2022/4/22
 * 描述：老师实体类
 * 一对一：一方持有另外一方对象，一方对应标签<association></association>
 *
 * @author ZSAndroid
 * @create 2022-04-22-16:12
 */
public class TeacherBean {
    private Integer id;
    private String name;
    private String age;
    private ClassBean classBean;

    public TeacherBean() {
    }

    public TeacherBean(String name, String age, ClassBean classBean) {
        this.name = name;
        this.age = age;
        this.classBean = classBean;
    }

    public TeacherBean(Integer id, String name, String age, ClassBean classBean) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classBean = classBean;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public ClassBean getClassBean() {
        return classBean;
    }

    public void setClassBean(ClassBean classBean) {
        this.classBean = classBean;
    }

    @Override
    public String toString() {
        return "TeacherBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", classBean=" + classBean +
                '}';
    }
}
