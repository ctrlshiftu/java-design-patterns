package com.cherish.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式：对象间的一种 一对多 的依赖关系。
 *           当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 *
 * 需求：订阅报纸的案例中，多个订阅者都是在观察同一个报社对象，此时报社对象就是被观察的目标。
 * 分析：报社作为被观察者，都有些什么功能？
 *      1）注册订阅者，也就是别人来订阅报纸，报社肯定要有相应的记录；
 *      2）出版报纸，这是报社的主要工作；
 *      3）发行报纸，把出版的报纸发送到订阅者手中
 *      4）退订报纸，当订阅者不想继续订阅了，可以取消订阅。
 *
 * 目标对象，作为被观察者
 *
 * @author zengjia
 */
public class Subject {

    // 订阅者列表，也就是观察者
    private final List<Observer> readers = new ArrayList<>();

    /**
     * 报纸的读者需要向报社订阅，先要注册
     * @param reader 报纸的读者
     * @return 是否注册陈功
     */
    public boolean attach(Observer reader)
    {
        return readers.add(reader);
    }

    /**
     * 取消订阅
     * @param reader 读者
     * @return 是否取消成功
     */
    public boolean detach(Observer reader) {
        return readers.remove(reader);
    }

    protected void notifyObservers() {
        for (Observer reader : readers) {
            reader.update(this);
        }
    }

}
