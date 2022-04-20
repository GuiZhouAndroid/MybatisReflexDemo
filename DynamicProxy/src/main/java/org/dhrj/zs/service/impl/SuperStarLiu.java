package org.dhrj.zs.service.impl;

import org.dhrj.zs.service.Service;

/**
 * created by on 2022/4/12
 * 描述：目标对象--->歌手，实现业务接口，开始唱歌表演
 *
 * @author ZSAndroid
 * @create 2022-04-12-16:12
 */
public class SuperStarLiu implements Service {

    @Override
    public void sing() {
        System.out.println("歌手一正在唱歌...");
    }
}
