package com.design.pattern.strategy;

/**
 * @author shoo on 2018/6/7 22:28.
 * @description 抽象策略
 */
public interface Discount {
    //声明抽象算法,计算
    public abstract double calculate(double price);
}
