package com.design.pattern.exercise.strategy.concreteStrategy;

import com.design.pattern.exercise.strategy.Fly;

/**
 * @author shoo on 2018/6/10 22:21.
 *         -  客机 -
 */
public class AirPlane implements Fly {
    @Override
    public void takeOff() {
        System.out.println("客机：长距离起飞");
    }

    @Override
    public void fly() {
        System.out.println("客机：亚音速飞行");
    }
}
