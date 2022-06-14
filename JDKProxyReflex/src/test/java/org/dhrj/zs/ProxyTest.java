package org.dhrj.zs;

import org.dhrj.zs.proxy.ProxyFactory;
import org.dhrj.zs.service.Service;
import org.dhrj.zs.service.impl.SuperSatZhou;
import org.dhrj.zs.service.impl.SuperStarLiu;
import org.junit.Test;

/**
 * created by on 2022/4/18
 * 描述：JDK动态代理测试类
 *
 * @author ZSAndroid
 * @create 2022-04-18-10:55
 */
//JDK动态代理测试类
public class ProxyTest {

    @Test
    public void test1() {
        ProxyFactory proxyFactory = new ProxyFactory(new SuperSatZhou());
        Service agent = (Service) proxyFactory.getAgent();
        agent.sing();
    }

    @Test
    public void test2() {
        ProxyFactory proxyFactory = new ProxyFactory(new SuperSatZhou());
        Service agent = (Service) proxyFactory.getAgent();
        System.out.println(agent.showAge(25));
    }

    @Test
    public void test3() {
        ProxyFactory proxyFactory = new ProxyFactory(new SuperStarLiu());
        Service agent = (Service) proxyFactory.getAgent();
        System.out.println(agent.showAge(50));
        System.out.println(agent.getClass());//动态代理类型：class com.sun.proxy.$Proxy2
    }
}
