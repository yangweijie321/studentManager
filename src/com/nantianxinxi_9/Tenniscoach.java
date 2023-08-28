package com.nantianxinxi_9;

public class Tenniscoach extends Coach implements Studyenglish {

    public Tenniscoach() {
    }

    public Tenniscoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃大白菜，喝小米粥");
    }

    @Override
    public void studyEg() {
        System.out.println("乒乓球教练学习英语知识");
    }

    @Override
    public void teach() {
        System.out.println("传授乒乓球技巧");
    }
}
