package org.dhrj.zs;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * created by on 2022/4/18
 * 描述：注解： 在程序当中等同于一个标记，如果有这个注解怎么样，没有这个注解会怎么样
 *
 * @author ZSAndroid
 * @create 2022-04-18-17:01
 */
@Target(ElementType.TYPE)//@Id注解只能标注出现在类上
@Retention(RetentionPolicy.RUNTIME)//能够被反射机制读取到
public @interface Id {}
