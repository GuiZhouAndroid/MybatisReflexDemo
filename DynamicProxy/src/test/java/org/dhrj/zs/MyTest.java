package org.dhrj.zs;

import org.dhrj.zs.service.Service;
import org.dhrj.zs.service.impl.Agent;
import org.dhrj.zs.service.impl.SuperStarZhou;
import org.junit.Test;

/**
 * created by on 2022/4/12
 * 描述：测试类
 * 有接口和实现类，必须使用接口指向实现类(规范)
 * 面向接口编程：类中的成员变量设计为接口，方法的形参设计为接口，方法的返回值设计为接口，调用时接口指向实现类
 * @author ZSAndroid
 * @create 2022-04-12-16:20
 */
public class MyTest {
    @Test
    public void test(){
        Service service = new Agent(new SuperStarZhou());
        service.sing();
    }
}
