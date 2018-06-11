package com.design.pattern.strategy.concreteStrategy;

import com.design.pattern.strategy.Discount;

/**
 * @author shoo on 2018/6/7 22:32.
 *  学生票，八折
 */
public class StudentTicket implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("-------学生票-------");
        return price*0.8;
    }
}
