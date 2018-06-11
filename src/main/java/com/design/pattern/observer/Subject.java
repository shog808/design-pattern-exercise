package com.design.pattern.observer;

import java.util.ArrayList;

/**
 * @author shoo on 2018/6/10 22:56.
 *         - 抽象目标  -
 */
public abstract class Subject {
    /*
    * 观察者列表
    * */
    protected ArrayList<Observer> observers = new ArrayList<Observer>();

    /*
    * 注册方法，用于向观察者集合中增加一个观察者
    * */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /*
    * 注销方法，用于在观察者集合中删除一个观察者
    * */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /*
    * 声明抽象通知方法
    * */
    public abstract void notice(String content);

}
