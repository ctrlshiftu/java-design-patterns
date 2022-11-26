package com.cherish.abstractfactory;

/**
 * @author zengjia
 */
public class Schema2 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(939);
    }

    @Override
    public MainBoardApi createMainBoardApi() {
        return new MSIMainBoard(939);
    }
}
