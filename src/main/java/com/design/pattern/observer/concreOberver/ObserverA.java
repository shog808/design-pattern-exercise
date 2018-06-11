package com.design.pattern.observer.concreOberver;

import com.design.pattern.observer.Observer;

/**
 * @author shoo on 2018/6/10 23:02.
 *         -  具体观察者A -
 */
public class ObserverA implements Observer {
    /*
    * 是否收到通知
    * */
    private boolean receiveNotice = false;
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
        System.out.println("ObserverA→" + this.getNotice() + "，内容：" + content);
    }
}
