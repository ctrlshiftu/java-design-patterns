package com.iluwatar.strategy.com.cherish.strategy.com.cherish.strategyTemplate;

/**
 * @author zengjia
 */
public class FileLog extends AbstractStrategyTemplate {
    @Override
    protected void doLog(String msg) {
        System.out.println("现在把" + msg + "记录到文件中(策略模板方法模式)");
    }
}
