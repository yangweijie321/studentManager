package com.nantianxinxi_8;

public class Demo {
    public static void main(String[] args) {

        Animal a = new Cat();
        a.setName("牛肉");
        a.setAge(1);
        System.out.println(a.getName()+","+a.getAge()+"岁");
        a.eat();
        System.out.println("--------");
        Jumpping j = new Cat();
        j.jump();

        System.out.println("--------");
        a = new Cat("粉条",2);
        System.out.println(a.getName()+","+a.getAge()+"岁");
        a.eat();
        System.out.println("--------");
        j.jump();


        System.out.println("--------");
        a = new Dog();
        a.setName("西梅");
        a.setAge(1);
        System.out.println(a.getName()+","+a.getAge()+"岁");
        a.eat();
        System.out.println("--------");
        Jumpping j1 = new Dog();
        j1.jump();

        System.out.println("--------");
        a = new Dog("可乐",2);
        System.out.println(a.getName()+","+a.getAge()+"岁");
        a.eat();
        System.out.println("--------");
        j1.jump();



    }
}
