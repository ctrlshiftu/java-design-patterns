package com.cherish;

/**
 * 客户端
 *
 * @author zengjia
 */
public class Client {

    public static void main(String[] args) {
        // 定义所有的组合对象
        Component root = new Composite("服装");
        Component man = new Composite("男装");
        Component woman = new Composite("女装");

        // 叶子对象
        Component leaf1 = new Leaf("衬衣");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("裙子");
        Component leaf4 = new Leaf("套装");

        // 组合对象
        root.addChild(man);
        root.addChild(woman);

        man.addChild(leaf1);
        man.addChild(leaf2);
        woman.addChild(leaf3);
        woman.addChild(leaf4);

        root.printStruct("");
    }
}
