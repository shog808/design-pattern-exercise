package com.design.pattern.decorator;

import com.design.pattern.decorator.component.Window;
import com.design.pattern.decorator.decorator.BlackBorderDecorator;
import com.design.pattern.decorator.decorator.ScrollBarDecorator;

/**
 * @author shoo on 2018/6/14 15:26.
 *         -  装饰器测试 -
 */
public class TestDecorator {
    public static void main(String[] args) {
        Component component,componentSB;
        component = new Window();
        /*
        * 装饰滚动条
        * */
        componentSB = new ScrollBarDecorator(component);
        componentSB.display();

        /*
        * 装饰黑色窗体
        * */
        componentSB = new BlackBorderDecorator(componentSB);
        componentSB.display();


    }
}
