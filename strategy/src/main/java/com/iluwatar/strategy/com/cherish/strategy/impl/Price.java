package com.iluwatar.strategy.com.cherish.strategy.impl;

import com.iluwatar.strategy.com.cherish.strategy.impl.Strategy;

/**
 * price类作为上下文：价格管理，主要完成计算向客户所报价格的功能
 *
 * @author zengjia
 */
public class Price {

    // 持有一个具体的策略对象
    private final Strategy strategy;

    /**
     * 构造方法，传入一个具体的策略对象
     */
    public Price(Strategy aStrategy) {
        this.strategy = aStrategy;
    }

    public double quote(double goodsPrice) {
        return this.strategy.calcPrice(goodsPrice);
    }
}
