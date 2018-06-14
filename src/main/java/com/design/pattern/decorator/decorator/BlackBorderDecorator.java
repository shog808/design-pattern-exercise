package com.design.pattern.decorator.decorator;

import com.design.pattern.decorator.Component;
import com.design.pattern.decorator.ComponentDecorator;

/**
 * @author shoo on 2018/6/14 15:17.
 *         - 黑色边框装饰类  -
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    /*
    * 装饰黑色边框
    * */
    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder(){
        System.out.println("为构件增加黑色边框！");
    }
}
