package com.iluwatar.strategy.com.cherish.strategy.com.cherish.tolerantRecovery;

/**
 * 客户
 *
 * @author zengjia
 */
public class Client {

    public static void main(String[] args) {
        LogContext context = new LogContext();
        context.log("记录日志");
        context.log("再次记录日志");
    }
}
