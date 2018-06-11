package com.design.pattern.observer;

import com.design.pattern.observer.concreOberver.ObserverA;
import com.design.pattern.observer.concreOberver.ObserverB;

/**
 * @author shoo on 2018/6/11 21:52.
 *         -  观察者测试类 -
 */
public class TestObserver {
    public static void main(String[] args) {
        //1.声明一个主题，即被观察者
        Subject subject = new ConcreteSubject();
        //2.添加观察者
        Observer observer = new ObserverA();
        subject.attach(observer);
        //3.添加观察者
        subject.attach(new ObserverB());
        //4.通知每一个观察者
        subject.notice("赶紧干活！！！");
        //5.移除一个观察者
        subject.detach(observer);
        subject.notice("休息会儿吧");
    }
}
