package com.design.pattern.exercise.strategy;

import com.design.pattern.exercise.strategy.concreteStrategy.Fighter;

/**
 * @author shoo on 2018/6/10 22:29.
 *         - 飞行测试类  -
 */
public class TestPlane {
    public static void main(String[] args) {
        Plane plane = new Plane(new Fighter());
        plane.fly();
    }
}
