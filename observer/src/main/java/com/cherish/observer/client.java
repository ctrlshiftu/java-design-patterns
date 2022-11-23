package com.cherish.observer;

/**
 * 客户
 *
 * @author zengjia
 */
public class client {

    public static void main(String[] args) {
        // 报纸对象
        NewsPaper subject = new NewsPaper();
        // 创建阅读者1
        Reader reader1 = new Reader();
        reader1.setName("曾佳");

        // 创建阅读者2
        Reader reader2 = new Reader();
        reader2.setName("何倩");

        // 创建阅读者3
        Reader reader3 = new Reader();
        reader3.setName("珍稀");

        // 注册订阅者
        subject.attach(reader1);
        subject.attach(reader2);
        subject.attach(reader3);

        // 出版报纸
        subject.setContent("本期内容是观察者模式");

    }
}
