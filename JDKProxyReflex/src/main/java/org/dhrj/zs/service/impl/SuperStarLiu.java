package org.dhrj.zs.service.impl;

import org.dhrj.zs.service.Service;

/**
 * created by on 2022/4/13
 * 描述：目标对象--->刘德华
 *
 * @author ZSAndroid
 * @create 2022-04-13-10:54
 */

public class SuperStarLiu implements Service {

    @Override
    public void sing() {
        System.out.println("刘德华正在唱歌");
    }

    @Override
    public String showAge(int age) {
        return "刘德华有" + age + "岁";
    }
}
