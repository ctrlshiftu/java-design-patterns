package com.cherish.observer;

import java.util.Observable;

/**
 * 报纸对象，悲观者者具体实现
 *
 * 分析：将出版报纸的功能放到 实现类（NewsPaper中） 让 Subject 更加通用。
 *
 * @author zengjia
 */
public class NewsPaper extends Subject {

    /**
     * 报纸的具体内容
     */
    private String content;

    /**
     * 获取报纸内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 提示：实现观察者模式的时候，一定要注意触发通知的时机。
     *      一般是在完成了状态维护后触发 即 this.content = content 在前。
     *      因为通知会传递数据，不能够先通知后改数据。很容易导致观察者和目标对象的状态不一致
     *
     *
     * 设置报纸的具体内容，相当于要出版报纸了
     * @param content 报纸具体内容
     */
    public void setContent(String content) {
        this.content = content;
        // 内容有了，说明又出报纸了，那就通知所有读者
        notifyObservers();
    }
}
