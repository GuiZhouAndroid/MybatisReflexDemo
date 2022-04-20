package org.dhrj.zs.service.impl;

import org.dhrj.zs.service.Service;

/**
 * created by on 2022/4/13
 * 描述：目标对象--->周
 *
 * @author ZSAndroid
 * @create 2022-04-13-10:54
 */
public class SuperSatZhou implements Service {

    @Override
    public void sing() {
        System.out.println("周正在唱歌");
    }

    @Override
    public String show(int age) {
        return "ZhouShow---" + age;
    }
}
