package com.cherish.abstractfactory;

import com.sun.tools.javac.Main;

/**
 * 装机工程师
 *
 * @author zengjia
 */
public class ComputerEngineer {

    private CPUApi cpu;
    private MainBoardApi mainBoard;

    public void makeComputer (AbstractFactory schema) {
        // 准备好装机所需要的配件
        prepareHardware(schema);
        // 组装电脑
        // 测试电脑
        // 交付客户
    }

    private void prepareHardware(AbstractFactory schema) {
        // 这里要去准备 CPU 和 mainBoard 的具体实现。
        // 可是，装机工程师并不知道如何去创建，怎么办？

        // 使用抽象工厂来获取相应的接口对象
        this.cpu = schema.createCPUApi();
        this.mainBoard = schema.createMainBoardApi();

        // 测试配件是否好用
        this.cpu.calculate();
        this.mainBoard.installCpu();
    }
}
