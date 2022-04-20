package org.dhrj.zs;

import org.junit.Test;

/**
 * created by on 2022/4/18
 * 描述：反射机制父类+接口测试相关
 *
 * @author ZSAndroid
 * @create 2022-04-18-15:58
 */
public class FatherInterfaceTest {
    @Test
    public void test1() throws Exception {
        Class strClass = Class.forName("java.lang.String");
        System.out.println(strClass.getSuperclass().getSimpleName());//父类
        Class[] interfaces = strClass.getInterfaces();  //实现的所有接口
        for (Class c : interfaces) {
            System.out.println(c.getSimpleName());
        }

    }
}
