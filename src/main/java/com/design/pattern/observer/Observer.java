package com.design.pattern.observer;

/**
 * @author shoo on 2018/6/10 22:58.
 *         - 抽象观察者  -
 */
public interface Observer {
    /*
    * 声明观察者需执行的方法，不同观察者有自己的实现
    * */
    public void update(String content);
}
