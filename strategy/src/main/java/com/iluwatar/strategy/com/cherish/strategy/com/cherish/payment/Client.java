package com.iluwatar.strategy.com.cherish.strategy.com.cherish.payment;

/**
 * 客户端
 *
 * @author zengjia
 */
public class Client {

    public static void main(String[] args) {
        // 创建相应的支付策略

        // 准备支付上下文
        PaymentStrategy rmbStrategy = new RMBCash();
        PaymentContext ctx1 = new PaymentContext("曾佳", 5000.40, rmbStrategy);
        // 支付工资
        ctx1.payNow();

        // 切换一个人，给 petter 支付工资
        PaymentStrategy dollarStrategy = new DollarCash();
        PaymentContext petter = new PaymentContext("Petter", 1000, dollarStrategy);
        petter.payNow();

        // 测试新添加的支付方式
        PaymentStrategy cardStrategy = new Card("012342u3923");
        PaymentContext ctx4 = new PaymentContext("校长", 9000, cardStrategy);
        ctx4.payNow();
    }
}
