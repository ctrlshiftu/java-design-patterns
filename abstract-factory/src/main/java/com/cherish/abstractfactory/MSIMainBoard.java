package com.cherish.abstractfactory;

/**
 * @author zengjia
 */
public class MSIMainBoard implements MainBoardApi {

    /**
     * cpu 插槽的孔数
     */
    private int cpuHoles = 0;

    public MSIMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("now in MSIMainBoard, cpuHoles=" + cpuHoles);
    }
}