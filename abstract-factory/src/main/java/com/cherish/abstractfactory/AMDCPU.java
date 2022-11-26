package com.cherish.abstractfactory;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * @author zengjia
 */
public class AMDCPU implements CPUApi {

    /**
     * cpu 的针脚数目
     */
    private int pins = 0;
    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now in CMD CPU,PINS=" + pins);
    }
}
