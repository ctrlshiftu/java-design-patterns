package com.iluwatar.strategy.com.cherish.strategy.impl;

/**
 * 老客户应报的价格
 *
 * @author zengjia
 */
public class OldCustomerStrategy implements Strategy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于老客户，统一折扣5%");
        return goodsPrice * (1 - 0.05);
    }
}
