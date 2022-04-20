package org.dhrj.zs;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

/**
 * created by on 2022/4/13
 * 描述：反射机制Field测试相关
 *
 * @author ZSAndroid
 * @create 2022-04-13-11:37
 */
public class ReflectTest {

    @Test
    public void test1() throws Exception {
        System.out.println(Class.forName("org.dhrj.zs.service.impl.SuperStarLiu").newInstance());
    }

    @Test
    public void test2() throws Exception {
        Class stuClass = Class.forName("org.dhrj.zs.bean.Student");
        System.out.println("完整类：" + stuClass.getName());
        System.out.println("简洁类：" + stuClass.getSimpleName());

        Field[] stuClassFiles1 = stuClass.getFields();//只查询public修饰的字段【包括getField("")】，返回数组。
        System.out.println("getFields长度：" + stuClassFiles1.length);
        System.out.println("getFields索引：" + stuClassFiles1[1]);

        Field[] stuClassFiles2 = stuClass.getDeclaredFields();//查询全部访问修饰符的字段【getDeclaredField("")】，返回数组
        System.out.println("getDeclaredFields长度：" + stuClassFiles2.length);
        System.out.println("getDeclaredFields索引：" + stuClassFiles2[4]);

        for (Field f : stuClassFiles2) { //一个f(Filed)：修饰符+包名.类型(Class类名)+包名.类名.属性名
            System.out.println("-----------循环------------");
            System.out.println("全部Filed===" + f);
            System.out.println("--------取修饰符-------------");
            System.out.println(Modifier.toString(f.getModifiers()));//int代号转为修饰符字符串
            System.out.println("--------取数据类型-------------");
            System.out.println("完整类：" + f.getType().getName() + "，简洁类：" + f.getType().getSimpleName());
            System.out.println("--------取属性名-------------");
            System.out.println(f.getName());
        }
    }

    @Test
    public void test3() throws Exception {
        StringBuilder s = new StringBuilder();
        Class stuClass = Class.forName("org.dhrj.zs.bean.Student");
        s.append(Modifier.toString(stuClass.getModifiers()) + " class " + stuClass.getSimpleName() + " {\n");
        Field[] fields = stuClass.getDeclaredFields();
        for (Field f : fields) {
            s.append("\t");
            s.append(Modifier.toString(f.getModifiers()));
            s.append(" ");
            s.append(f.getType().getSimpleName());
            s.append(" ");
            s.append(f.getName());
            s.append(";\n");
        }
        s.append("}");
        System.out.println(s);
    }

    @Test
    public void test4() throws Exception {
        //使用反射机制访问对象的属性
        //1.获取Student的class类
        Class stuClass = Class.forName("org.dhrj.zs.bean.Student");
        //2.使用反射机制创建对象
        Object obj = stuClass.newInstance();
        //3.获取学号属性
        Field noField = stuClass.getDeclaredField(ResourceBundle.getBundle("student").getString("StudentNo"));
        System.out.println(noField);
        //4.obj对象(Student对象)的学号属性赋值
        noField.set(obj, Integer.parseInt(ResourceBundle.getBundle("student").getString("stuNoValues")));
        //5.读取的学号属性的值
        System.out.println("赋值学号属性的值-----" + noField.get(obj));
    }

    @Test
    public void test5() throws Exception {
        Class stuClass = Class.forName("org.dhrj.zs.bean.Student");
        Object obj = stuClass.newInstance();
        Field noField = stuClass.getDeclaredField(ResourceBundle.getBundle("student").getString("emailKey"));
        System.out.println(noField);
        noField.setAccessible(true);//打破Student的私有封装，降低程序安全性。
        noField.set(obj, ResourceBundle.getBundle("student").getString("emailValues"));
        System.out.println("赋值邮箱属性的值-----" + noField.get(obj));
    }

    @Test
    public void test6() throws Exception {
        Class stuClass = Class.forName("org.dhrj.zs.bean.Student");
        Object obj = stuClass.newInstance();
        Field noField = stuClass.getDeclaredField(ResourceBundle.getBundle("student").getString("emailKey"));
        System.out.println(noField);
        noField.setAccessible(true);//打破Student的私有封装，降低程序安全性。
        noField.set(obj, ResourceBundle.getBundle("student").getString("emailValues"));
        System.out.println("赋值邮箱属性的值-----" + noField.get(obj));
    }
}


