package com.iluwatar.strategy.com.cherish.strategy.impl;

/**
 * 大客户计算应报的价格
 *
 * @author zengjia
 */
public class LargeCustomerStrategy implements Strategy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("大客户，统一折扣10%");
        return goodsPrice * (1 - 0.1);
    }
}
