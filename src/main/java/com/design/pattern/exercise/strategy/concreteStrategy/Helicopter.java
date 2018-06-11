package com.design.pattern.exercise.strategy.concreteStrategy;

import com.design.pattern.exercise.strategy.Fly;

/**
 * @author shoo on 2018/6/10 22:20.
 *         -  直升机 -
 */
public class Helicopter implements Fly {
    @Override
    public void takeOff() {
        System.out.println("直升机：垂直起飞");
    }

    @Override
    public void fly() {
        System.out.println("直升机：亚音速飞行");
    }
}
