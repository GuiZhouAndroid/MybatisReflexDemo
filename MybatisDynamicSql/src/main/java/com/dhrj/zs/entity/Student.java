package com.dhrj.zs.entity;

/**
 * created by on 2022/4/20
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-04-20-18:52
 */
//@Alias("xxxMapper.xml使用<package>标签批量注册的自定义别名，不使用此注解默认为类的驼峰命名")
public class Student {
    private Integer id;
    private String name;
    private String email;
    private Integer age;

    public Student() {
    }

    public Student(String name, String email, Integer age) {

        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Student(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

