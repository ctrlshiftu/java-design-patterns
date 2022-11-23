package com.cherish;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合对象，可以包含其它组合对象或者叶子对象
 *
 * @author zengjia
 */
public class Composite extends Component {

    /**
     * 存储组合对象中包含的子组件对象
     */
    private List<Component> childComponents = null;

    private String name = "";

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component child) {
        // 延迟初始化
        if (null == childComponents) {
            childComponents = new ArrayList<>();
        }
        childComponents.add(child);
    }

    @Override
    public void printStruct(String preStr) {
        // 先把自己输出去
        System.out.println(preStr + "+" + this.name);
        // 包含子组件，再输出子组件对象
        if (null != this.childComponents) {
            // 添加一个空格输出
            preStr += " ";
            // 输出每个子对象
            for (Component component : childComponents) {
                component.printStruct(preStr);
            }
        }
    }
}
