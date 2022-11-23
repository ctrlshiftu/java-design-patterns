package com.iluwatar.strategy.com.cherish.strategy.com.cherish.payment;

/**
 * @author zengjia
 */
public class DollarCash implements PaymentStrategy {
    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给" + ctx.getUserName() + "美元现金支付" + ctx.getMoney() + "$");
    }
}
