package org.dhrj.zs.service.impl;

import org.dhrj.zs.service.Service;

/**
 * created by on 2022/4/12
 * 描述：明星唱歌表演的代理对象，完成歌手唱歌表演之外的其它业务
 *
 * @author ZSAndroid
 * @create 2022-04-12-16:16
 */
public class Agent implements Service {
    //1.类中的成员变量设计为接口
    public Service target; //目标对象

    //2.方法的形参设计为接口
    public Agent(Service target) { //传入目标对象
        this.target = target;
    }

    @Override
    public void sing() {
        System.out.println("预订时间");
        System.out.println("预订场地");
        //3.调用时接口指向实现类
        target.sing();//目标对象开始唱歌
        System.out.println("结算费用");
    }
}
