package com.dhrj.java.zsitking;

import org.junit.Test;

/**
 * created by on 2022/6/14
 * 描述：测试CGLib动态代理
 *
 * @author ZSAndroid
 * @create 2022-06-14-17:59
 */
public class test {
    @Test
    public void testCglibProxy() {
        SuperSatZhou superStar = new SuperSatZhou();
        System.out.println("代理前类型" + superStar.getClass());
        SuperSatZhou proxy = (SuperSatZhou) new CGLibProxyFactory(superStar).getProxyInstance();
        System.out.println("代理后类型" + proxy.getClass());
        proxy.sing();
    }
}
