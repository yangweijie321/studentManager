package com.nantianxinxi_9;

public class Paddler extends Athletes implements Studyenglish {

    public Paddler() {
    }

    public Paddler(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃小白菜，喝大米粥");
    }

    @Override
    public void studyEg() {
        System.out.println("乒乓球运动员学习英语知识");
    }

    @Override
    public void study() {
        System.out.println("学习乒乓球技术");
    }
}
