package org.dhrj.zs;

import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * created by on 2022/4/18
 * 描述：反射机制Method测试相关
 *
 * @author ZSAndroid
 * @create 2022-04-18-14:32
 */
public class MethodTest {

    @Test
    public void test1() throws Exception {
        Class zhouClass = Class.forName("org.dhrj.zs.service.impl.SuperSatZhou");
        Method[] methods = zhouClass.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println("访问修饰符--" + Modifier.toString(m.getModifiers()));
            System.out.println("返回值类型--" + m.getReturnType().getSimpleName());
            System.out.println("方法名--" + m.getName());
            Class[] parameterTypes = m.getParameterTypes();
            for (Class type : parameterTypes) {
                System.out.println("方法修饰符列表--" + type);
            }
        }
    }

    @Test
    public void test2() throws Exception {
        Class zhouClass = Class.forName("org.dhrj.zs.service.impl.SuperSatZhou");
        Object obj = zhouClass.newInstance();
        Method method = zhouClass.getDeclaredMethod("show", int.class);
        Object result = method.invoke(obj, 45);
        System.out.println(result);
    }
}
