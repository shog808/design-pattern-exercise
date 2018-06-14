package com.design.pattern.decorator.decorator;

import com.design.pattern.decorator.Component;
import com.design.pattern.decorator.ComponentDecorator;

/**
 * @author shoo on 2018/6/14 15:12.
 *         - 滚动条装饰类  -
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    /*
    * 装饰滚动条
    * */
    @Override
   public void display(){
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("为构件增加滚动条！");
    }
}
