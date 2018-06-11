package com.design.pattern.exercise.strategy;

/**
 * @author shoo on 2018/6/10 22:26.
 *         -   -
 */
public class Plane {
    private Fly fly;

    public Plane(Fly fly) {
        this.fly = fly;
    }

    public void fly(){
        fly.takeOff();
        fly.fly();
    }
}
