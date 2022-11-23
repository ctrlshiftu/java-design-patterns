package com.iluwatar.strategy.com.cherish.strategy.com.cherish.strategyTemplate;

/**
 * 策略模式-模板方法模式
 *      1） 定义一个记录日志的策略接口
 *      2） 定义抽象类实现策略接口，在抽象类中定义记录日志的算法骨架，相当于模板方法模式的模板
 *      3）具体算法策略，不再直接实现策略接口，而是继承模板，实现模板方法。
 *      4）上下文延用之前的，不作改变
 *
 *
 * 日志记录策略的接口
 *
 * @author zengjia
 */
public interface LogStrategy {

    /**
     * 记录日志
     * @param msg 需记录的日志信息
     */
    public void log(String msg);
}
