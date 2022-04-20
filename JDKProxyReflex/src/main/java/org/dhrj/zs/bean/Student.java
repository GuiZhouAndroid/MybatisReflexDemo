package org.dhrj.zs.bean;

import lombok.Data;

/**
 * created by on 2022/4/14
 * 描述：测试反射机制Field--->学生类
 *
 * @author ZSAndroid
 * @create 2022-04-14-10:37
 */
@Data
public class Student {

    public int stuNo;
    public int stuAge;
    protected String stuAddress;
    Double phoneNumber;
    private static String email;

    public Student() {
    }

    public Student(int stuNo, int stuAge) {
        this.stuNo = stuNo;
        this.stuAge = stuAge;
    }

    public Student(int stuNo, int stuAge, String stuAddress) {
        this.stuNo = stuNo;
        this.stuAge = stuAge;
        this.stuAddress = stuAddress;
    }

    public Student(int stuNo, int stuAge, String stuAddress, Double phoneNumber) {
        this.stuNo = stuNo;
        this.stuAge = stuAge;
        this.stuAddress = stuAddress;
        this.phoneNumber = phoneNumber;
    }
}
