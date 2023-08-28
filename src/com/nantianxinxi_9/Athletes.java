package com.nantianxinxi_9;

public abstract class Athletes extends Human {

    public Athletes() {
    }

    public Athletes(String name, int age) {
        super(name, age);
    }

    public abstract void study();

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
