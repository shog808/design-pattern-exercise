package com.design.pattern.observer;

/**
 * @author shoo on 2018/6/10 23:14.
 *         - 具体主题  -
 */
public class ConcreteSubject extends Subject {
    @Override
    /*
    * 通知每一个观察者，观察者收到通知去执行自己的业务逻辑
    * */
    public void notice(String content) {
        for (Observer observer:observers){
            observer.update(content);
        }
    }
}
