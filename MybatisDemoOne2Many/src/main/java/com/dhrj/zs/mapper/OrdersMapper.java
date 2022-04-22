package com.dhrj.zs.mapper;

import com.dhrj.zs.entity.OrdersBean;

/**
 * created by on 2022/4/22
 * 描述：
 *
 * @author ZSAndroid
 * @create 2022-04-22-14:57
 */
public interface OrdersMapper {
    //根据订单id查询订单信息同时查询此订单所属的客户信息
    OrdersBean getOrdersOfCustomerByOrdersId(Integer ordersId);
}
