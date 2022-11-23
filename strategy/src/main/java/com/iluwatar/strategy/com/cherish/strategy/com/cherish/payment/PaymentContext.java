package com.iluwatar.strategy.com.cherish.strategy.com.cherish.payment;

/**
 * 支付工资上下文
 *
 * @author zengjia
 */
public class PaymentContext {
    // 应该被支付工资的人员
    private String userName;
    // 应支付工资
    private double money;
    // 支付工资的方式
    private PaymentStrategy strategy;

    public PaymentContext(String userName, double money, PaymentStrategy strategy) {
        this.userName = userName;
        this.strategy = strategy;
        this.money = money;
    }

    /**
     * 只提供了 getter 方法，rang让策略算法在实现的时候，根据需要来获取上下文的数据
     * * @return
     */
    public String getUserName() {
        return userName;
    }

    public double getMoney() {
        return money;
    }

    /**
     * 立即支付工资
     */
    public void payNow() {
        // 使用客户希望的支付策略来支付工资
        this.strategy.pay(this);
    }
}
