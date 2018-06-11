package com.design.pattern.strategy.concreteStrategy;

import com.design.pattern.strategy.Discount;

/**
 * @author shoo on 2018/6/10 21:30.
 *         - 成人票，原价  -
 */
public class AdultTicket implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("-------成人票-------");
        return price;
    }
}
