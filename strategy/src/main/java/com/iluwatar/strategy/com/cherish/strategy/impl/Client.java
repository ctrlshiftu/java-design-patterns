package com.iluwatar.strategy.com.cherish.strategy.impl;

/**
 * 客户端
 *
 * @author zengjia
 */
public class Client {

    public static void main(String[] args) {
        // 1 选择并创建需要使用的策略对象
        LargeCustomerStrategy largeCustomerStrategy = new LargeCustomerStrategy();
        // 2 创建上下文
        Price context = new Price(largeCustomerStrategy);
        // 3 计算报价
        double quote = context.quote(1000);
        System.out.println("向客户报价：" + quote);
    }
}
