package com.design.pattern.decorator.component;

import com.design.pattern.decorator.Component;

/**
 * @author shoo on 2018/6/14 15:02.
 *         -  具体构件类：窗体 -
 */
public class Window extends Component {
    @Override
    public void display() {
        System.out.println("显示窗体！");
    }
}
