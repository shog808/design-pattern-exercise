package com.design.pattern.exercise.strategy.concreteStrategy;

import com.design.pattern.exercise.strategy.Fly;

/**
 * @author shoo on 2018/6/10 22:25.
 *         -  鹞式战斗机 -
 */
public class Harrier implements Fly {
    @Override
    public void takeOff() {
        System.out.println("鹞式战斗机：垂直起飞");
    }

    @Override
    public void fly() {
        System.out.println("鹞式战斗机：超音速飞行");
    }
}
