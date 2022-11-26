package com.cherish.abstractfactory;

/**
 * @author zengjia
 */
public class GAMainBoard implements MainBoardApi {

    /**
     * cpu 插槽的孔数
     */
    private int cpuHoles = 0;
    public GAMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("now in GAMainBoard, cpuHoles=" + cpuHoles);
    }
}
