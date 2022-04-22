package com.dhrj.zs.entity;

/**
 * created by on 2022/4/22
 * 描述：订单实体类
 * 多对一： 多方持有一方的对象
 *
 * @author ZSAndroid
 * @create 2022-04-22-11:45
 */
public class OrdersBean {

    private Integer id;
    private String orderNumber;
    private Double orderPrice;
    private CustomerBean customerBean;

    public OrdersBean() {
    }

    public OrdersBean(String orderNumber, Double orderPrice, CustomerBean customerBean) {
        this.orderNumber = orderNumber;
        this.orderPrice = orderPrice;
        this.customerBean = customerBean;
    }

    public OrdersBean(Integer id, String orderNumber, Double orderPrice, CustomerBean customerBean) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.orderPrice = orderPrice;
        this.customerBean = customerBean;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public CustomerBean getCustomerBean() {
        return customerBean;
    }

    public void setCustomerBean(CustomerBean customerBean) {
        this.customerBean = customerBean;
    }

    @Override
    public String toString() {
        return "OrdersBean{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderPrice=" + orderPrice +
                ", customerBean=" + customerBean +
                '}';
    }
}
