package org.dhrj.zs;

import org.junit.Test;

/**
 * created by on 2022/4/18
 * 描述：反射机制Construction测试相关
 *
 * @author ZSAndroid
 * @create 2022-04-18-14:32
 */
public class ConstructionTest {

    @Test
    public void test1() throws Exception {
        Class<?> stuClass = Class.forName("org.dhrj.zs.bean.Student");

        //调无参构造
        System.out.println(stuClass.newInstance());
        System.out.println(stuClass.getDeclaredConstructor().newInstance());

        //调有参构造
        System.out.println(stuClass.getDeclaredConstructors().length);

        Object obj1 = stuClass.getDeclaredConstructor(int.class, int.class).newInstance(12, 23);
        System.out.println(obj1);

        Object obj2 = stuClass.getDeclaredConstructor(int.class, int.class, String.class).newInstance(12, 23, "地址1");
        System.out.println(obj2);

        Object obj3 = stuClass.getDeclaredConstructor(int.class, int.class, String.class, Double.class).newInstance(12, 23, "地址1", 14.5);
        System.out.println(obj3);
    }
}
