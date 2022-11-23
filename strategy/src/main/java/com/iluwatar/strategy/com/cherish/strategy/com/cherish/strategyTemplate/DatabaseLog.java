package com.iluwatar.strategy.com.cherish.strategy.com.cherish.strategyTemplate;

/**
 * @author zengjia
 */
public class DatabaseLog extends AbstractStrategyTemplate {

    @Override
    protected void doLog(String msg) {
        // 制作错误
        if (msg != null && msg.trim().length() > 5) {
            int a = 5/0;
        }
        System.out.println("现在把" + msg + "记录到数据库中(策略模板方法模式)");
    }
}
