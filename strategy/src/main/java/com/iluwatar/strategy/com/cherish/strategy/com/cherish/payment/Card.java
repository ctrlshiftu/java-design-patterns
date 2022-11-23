package com.iluwatar.strategy.com.cherish.strategy.com.cherish.payment;

/**
 * @author zengjia
 */
public class Card implements PaymentStrategy {

    // 账户信息
    private String account;

    /**
     * 构造函数，传入账号信息
     */
    public Card(String account)
    {
        this.account = account;
    }

    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给" + ctx.getUserName() + "的" + this.account + "账号支付了" + ctx.getMoney() + "元");
        // 连接银行，进行转账，就不去管了

    }
}
