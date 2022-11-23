package com.cherish;

/**
 * 抽象组件
 *
 * @author zengjia
 */
public abstract class Component {

    /**
     * 输出组件自身的名称
     */
    public abstract void printStruct(String preStr);

    /**
     * 向组件对象中加入组件对象
     * @param child 待加入组件
     */
    public void addChild(Component child) {
        throw new UnsupportedOperationException("组件不支持此功能");
    }

    /**
     * 从组件中移除组件对象
     */
    public void removeChild(Component child) {
        throw new UnsupportedOperationException("组件不支持此功能");
    }
}
