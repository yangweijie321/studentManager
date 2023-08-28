package com.nantianxinxi_9;

public abstract class Coach extends Human {

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
