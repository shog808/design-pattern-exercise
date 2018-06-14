package com.design.pattern.decorator.component;

import com.design.pattern.decorator.Component;

/**
 * @author shoo on 2018/6/14 15:04.
 *         -  具体构件：文本框 -
 */
public class TextBox extends Component {
    @Override
    public void display() {
        System.out.println("显示文本框！");
    }
}
