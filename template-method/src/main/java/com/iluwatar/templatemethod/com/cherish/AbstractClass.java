package com.iluwatar.templatemethod.com.cherish;

/**
 * 模板方法模式：
 *      定义一个操作中的算法骨架，将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。
 *
 *
 * @author zengjia
 */
public abstract class AbstractClass {

    /**
     * 原语操作1，即抽象的操作，必须由子类提供实现
     */
    public abstract void doPrimitiveOperation1();

    public abstract void doPrimitiveOperation2();

    /**
     * 定义算法骨架
     */
    public final void templateMethod() {
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }
}
