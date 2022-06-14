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
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), //指定当前目标对象，使用类加载器获得
                target.getClass().getInterfaces(),//获得目标对象实现的所有接口
                new InvocationHandler() { //处理代理实例上的方法并返回调用结果
                    @Override
                    public Object invoke(
                            Object proxy, //代理对象的实例
                            Method method,//代理的目标对象的实现方法
                            Object[] args) throws Throwable { //代理的目标对象实现方法的参数
                        System.out.println("预订时间");
                        System.out.println("预订场地");
                        //目标对象通过调用反射自动执行自己的方法
                        Object returnValue = method.invoke(target, args);//sing(),show(args)
                        System.out.println("结算费用");

                        return returnValue;//返回目标对象执行方法的返回值
                    }
                });
    }
}
