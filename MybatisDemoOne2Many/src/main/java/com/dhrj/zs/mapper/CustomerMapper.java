package com.dhrj.zs.mapper;

import com.dhrj.zs.entity.CustomerBean;

/**
 * created by on 2022/4/20
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-04-20-19:00
 */
public interface CustomerMapper {
    //根据客户id查询用户信息以及拥有的全部订单信息
    CustomerBean getCusOrdersByUserId(Integer userId);
}
