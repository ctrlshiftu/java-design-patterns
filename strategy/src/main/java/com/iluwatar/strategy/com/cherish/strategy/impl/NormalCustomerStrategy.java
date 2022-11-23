package com.iluwatar.strategy.com.cherish.strategy.impl;

/**
 * 普通用户具体价格
 *
 * @author zengjia
 */
public class NormalCustomerStrategy implements Strategy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("新客户，没有折扣");
        return goodsPrice;
    }
}
