package com.cherish.observer;

/**
 * 在收到被通知的内容后，自身如何进行相应的处理的功能
 *
 * 报纸订阅者（读者）
 *
 * @author zengjia
 */
public class Reader implements Observer {

    // 读者姓名
    private String name;

    @Override
    public void update(Subject subject) {
        // 这是采用拉的方式
        System.out.println(name + "收到报纸了，阅读：" + ((NewsPaper) subject).getContent());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
