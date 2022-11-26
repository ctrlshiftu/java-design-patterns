package com.cherish.abstractfactory;

/**
 * 抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们的具体的类。
 *      抽象工厂接口内的方法不是任意堆砌的，而是一系列相关或相互依赖的方法。
 * 分析：
 *      1）只知道所需要的一系列对象的接口，而不知道具体实现，或者是不知道具体使用哪一个实现
 *      2）一系列对象是相关或相互依赖的，也就是说既要创建接口的对象，还要约束它们之间的关系。
 * 对比：工厂方法模式 或 简单工厂模式
 *          1）工厂方法模式和简单工厂模式 关注的 是单个产品对象的创建。比如创建 CPU 的工厂方法，就只关心如何创建 CPU 对象。
 *      抽象工厂模式
 *          1）创建一系列的产品对象，这些对象之间是有约束的
 *
 * 实现原理：
 *      1）定义一个抽象工厂，工厂内部虚拟地创建客户端需要的一系列对象，所谓虚拟就是定义创建这些对象的抽象方法，并不去真正地实现；
 *      2）然后由具体的子类来提供这一系列对象的创建。
 *
 *
 *
 * @author zengjia
 */
public class Client {

    public static void main(String[] args) {
        // 找一个装机工程师
        ComputerEngineer engineer = new ComputerEngineer();
        // 客户自己选择装机方案
        Schema1 schema = new Schema1();
        // 告诉装机工程师
        engineer.makeComputer(schema);
    }
}
