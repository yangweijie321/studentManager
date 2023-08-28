package com.nantianxinxi_10;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.method(j);


        Jumpping j2 = new Dog();
        jo.method(j2);
        System.out.println("--------");

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }
        });

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });
    }
}
