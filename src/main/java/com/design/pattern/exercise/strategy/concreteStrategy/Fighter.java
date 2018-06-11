package com.design.pattern.exercise.strategy.concreteStrategy;

import com.design.pattern.exercise.strategy.Fly;

/**
 * @author shoo on 2018/6/10 22:23.
 *         -  歼击机 -
 */
public class Fighter implements Fly {
    @Override
    public void takeOff() {
        System.out.println("歼击机：长距离起飞");
    }

    @Override
    public void fly() {
        System.out.println("歼击机：超音速飞行");
    }
}
