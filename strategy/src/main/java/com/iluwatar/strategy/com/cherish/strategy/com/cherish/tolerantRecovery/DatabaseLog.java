package com.iluwatar.strategy.com.cherish.strategy.com.cherish.tolerantRecovery;

/**
 * @author zengjia
 */
public class DatabaseLog implements LogStrategy {

    // 制造错误

    @Override
    public void log(String msg) {
        if (msg != null && msg.trim().length() > 5) {
            int a = 5/0;
        }
        System.out.println("现在把" + msg + "记录到数据库中");
    }
}
