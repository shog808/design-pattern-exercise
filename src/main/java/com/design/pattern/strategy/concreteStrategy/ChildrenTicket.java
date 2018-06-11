package com.design.pattern.strategy.concreteStrategy;

import com.design.pattern.strategy.Discount;

/**
 * @author shoo on 2018/6/10 21:21.
 *         - 儿童票，半价  -
 */
public class ChildrenTicket implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("-----儿童票------");
        return price*0.5;
    }
}
