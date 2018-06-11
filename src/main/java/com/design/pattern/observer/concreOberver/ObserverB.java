package com.design.pattern.observer.concreOberver;

import com.design.pattern.observer.Observer;

/**
 * @author shoo on 2018/6/11 21:45.
 *         - 具体观察者B  -
 */
public class ObserverB implements Observer {
    /*
    * 是否收到通知
    * */
    private boolean receiveNotice = false;
    /*
    * 通知内容
    * */
    private String notice;
    public String getNotice() {
        return this.receiveNotice?"收到通知":"未收到通知";
    }

    @Override
    /*
    * 执行自己需要的逻辑
    * */
    public void update(String content) {
        this.receiveNotice = true;
        System.out.println("ObserverB→" + this.getNotice() + "，内容：" + content);
    }
}
