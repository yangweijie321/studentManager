package com.nantianxinxi_4;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("西梅");
        d1.setAge(1);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.kM();

        Dog d2 = new Dog("可乐",1);
        System.out.println(d2.getName()+","+d2.getAge());
        d2.kM();

        Cat c1 = new Cat();
        c1.setName("牛肉");
        c1.setAge(2);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.zLs();

        Cat c2 = new Cat("粉条",3);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.zLs();


    }
}
