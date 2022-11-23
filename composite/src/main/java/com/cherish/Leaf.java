package com.cherish;

/**
 * @author zengjia
 */
public class Leaf extends Component {

    /**
     * 叶子对象的名称
     */
    private String name = "";

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}
