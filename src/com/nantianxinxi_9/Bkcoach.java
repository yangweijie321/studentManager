package com.nantianxinxi_9;

public class Bkcoach extends Coach {

    public Bkcoach() {
    }

    public Bkcoach(String name,int age){
        super(name,age);
    }

    @Override
    public void teach() {
        System.out.println("传授篮球技巧");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉，喝羊奶");
    }
}
