package com.design.pattern.strategy;

import com.design.pattern.strategy.concreteStrategy.AdultTicket;
import com.design.pattern.strategy.concreteStrategy.ChildrenTicket;
import com.design.pattern.strategy.concreteStrategy.StudentTicket;

/**
 * @author shoo on 2018/6/7 22:47.
 *         -  策略模式测试类 -
 */
public class Test {

    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        mt.setPrice(100);
        System.out.println("原票价是：" + mt.getPrice());
        //1.学生票
        mt.setDiscount(new StudentTicket());
        System.out.println("实际价格是：" + mt.getPrice());

        //2.儿童票
        mt.setDiscount(new ChildrenTicket());
        System.out.println("实际价格是：" + mt.getPrice());

        //3.成人票
        mt.setDiscount(new AdultTicket());
        System.out.println("实际价格是：" + mt.getPrice());

    }


}
