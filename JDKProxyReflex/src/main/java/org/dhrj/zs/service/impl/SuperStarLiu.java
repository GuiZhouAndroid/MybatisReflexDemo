package org.dhrj.zs.service.impl;

import org.dhrj.zs.service.Service;

/**
 * created by on 2022/4/13
 * 描述：目标对象--->刘
 *
 * @author ZSAndroid
 * @create 2022-04-13-10:54
 */

public class SuperStarLiu implements Service {

    static {
        System.out.println("我是静态代码块");
    }
    public SuperStarLiu() {
        System.out.println("Class.forName('.....').newInstance()调用了SuperStarLiu无参构造方法完成对象创建");
    }

    @Override
    public void sing() {
        System.out.println("刘正在唱歌");
    }

    @Override
    public String show(int age) {
        return "LiuShow---" + age;
    }
}
