package com.cherish.abstractfactory;

/**
 * 抽象工厂接口，声明创建抽象产品对象的操作
 *
 * @author zengjia
 */
public interface AbstractFactory {

    /**
     * 声明 CPU
     * @return CPU 对象
     */
    CPUApi createCPUApi();

    /**
     * 创建主板
     * @return 主板对象
     */
    MainBoardApi createMainBoardApi();
}
