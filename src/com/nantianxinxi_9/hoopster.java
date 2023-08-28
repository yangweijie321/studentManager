package com.nantianxinxi_9;

public class hoopster extends Athletes {

    public hoopster() {
    }

    public hoopster(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉，喝牛奶");
    }

    @Override
    public void study() {
        System.out.println("学习篮球技术");
    }
}
