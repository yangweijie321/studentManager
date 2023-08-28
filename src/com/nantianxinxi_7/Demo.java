package com.nantianxinxi_7;

public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("牛肉");
        a.setAge(1);
        System.out.println(a.getName()+","+a.getAge()+"岁");
        a.eat();

        a = new Cat("粉条",2);
        System.out.println(a.getName()+","+a.getAge()+"岁");
        a.eat();

        a = new Dog();
        a.setName("西梅");
        a.setAge(1);
        System.out.println(a.getName()+","+a.getAge()+"岁");
        a.eat();

        a = new Dog("可乐",2);
        System.out.println(a.getName()+","+a.getAge()+"岁");
        a.eat();
    }
}
