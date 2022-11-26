package com.cherish.builder.insurance;

/**
 * 场景：创建一个保险合同对象。
 *      采用 builder 模式来构建复杂的对象，通常会对 Builder 模式进行一定简化，因为目标明确，就是创建某个复杂对象，因此做适当简化会使程序更简洁。
 *          1）使用 Builder 模式创建某个对象，没有必要再定义Builder 接口，直接提供一个具体的构建器类
 *          2）创建一个复杂的对象，可能会有很多种不同的选择和步骤，干脆去掉 "指导者"，与Client 功能合并。
 *      通常有两个地方可以添加约束规则
 *          1）构建器的每一个类似于 setter 的方法。进行单个数据的约束规则校验，不正确，就抛出异常；
 *          2）构建器的 build() 方法处，在创建合同对象之前，对所有数据进行校验。
 *          3）把构建器对象和被构建对象合并；
 *              实际开发中，如果构建器对象和被构建对象是分开的话，可能会导致同包内的对象不适用构建器来构建对象。而是直接使用 new 来构建对象，容易导致错误。
 *
 * @author zengjia
 */
public class Client {
    public static void main(String[] args) {
        // 创建构造器
        InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("0001", 123456L, 78779999L);
        // 设置需要的数据
        InsuranceContract contract = builder.setPersonName("张山").setOtherData("test").build();
        // 操作保险合同对象
        contract.someOperation();

    }
}
