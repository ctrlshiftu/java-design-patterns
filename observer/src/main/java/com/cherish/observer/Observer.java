package com.cherish.observer;

/**
 * 观察者
 *
 * @author zengjia
 */
public interface Observer {

    /**
     * 被通知的方法
     * @param subject 具体的目标对象，可以获取报纸的内容
     */
    void update(Subject subject);
}
