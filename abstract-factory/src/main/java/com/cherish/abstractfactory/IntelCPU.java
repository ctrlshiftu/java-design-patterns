package com.cherish.abstractfactory;

/**
 * @author zengjia
 */
public class IntelCPU implements CPUApi {

    /**
     * cpu 的针脚数目
     */
    private int pins = 0;
    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now in Intel CPU,PINS=" + pins);
    }
}
