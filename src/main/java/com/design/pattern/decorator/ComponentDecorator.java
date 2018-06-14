package com.design.pattern.decorator;

/**
 * @author shoo on 2018/6/14 15:06.
 *         -  构件装饰类：抽象装饰类 -
 */
public class ComponentDecorator extends Component {
    /*
    * 引用抽象构件
    * */
    private Component component;
    /*
    * 注入抽象构件
    * */
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    /*
    * 通过调用抽象构件实现方法
    * */
    @Override
    public void display() {
        component.display();
    }
}
