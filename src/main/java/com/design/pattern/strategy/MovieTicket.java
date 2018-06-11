package com.design.pattern.strategy;

/**
 * @author shoo on 2018/6/7 22:42.
 *  上下文类
 */
class MovieTicket {
    private double price;
    //维持一个对抽象策略类的引用
     Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public MovieTicket(Discount discount) {
        this.discount = discount;
    }
    public MovieTicket() {

    }

    //使用注入的具体策略----→计算价格
    public double getPrice(){
        return discount==null?this.price:discount.calculate(price);
    }

}
