package org.dhrj.zs.proxy;

import org.dhrj.zs.service.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * created by on 2022/4/12
 * 描述：JDK动态代理工厂类
 * 本类中的方法(非接口中方法)不能被代理
 *
 * @author ZSAndroid
 * @create 2022-04-12-17:29
 */
public class ProxyFactory {

    //类中成员变量声明为接口
    public Service target;//目标对象

    //传入目标对象，方法设计为接口
    public ProxyFactory(Service target) {
        this.target = target;
    }

    //调用处理程序，返回指定接口的代理类实例(动态代理对象)
    public Object getAgent() {
        // 处理代理实例(代理对象)上的方法调用并返回结果(目标对象)。
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("预订时间");
                System.out.println("预订场地");
                //调用反射方法
                Object o = method.invoke(target, args);
                System.out.println("结算费用");

                return o;//返回目标对象的结果
            }
        });
    }
}
