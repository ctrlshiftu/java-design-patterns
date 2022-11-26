package com.cherish.abstractfactory;

/**
 * 装机方案一：Intel CPU + 技嘉 主板
 *      这里创建 cpu 和 主板 的时候，是对应的 ，能匹配上，如何体现呢？
 *
 * @author zengjia
 */
public class Schema1 implements AbstractFactory {

    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainBoardApi createMainBoardApi() {
        return new GAMainBoard(1156);
    }
}
