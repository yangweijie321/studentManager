package com.nantianxinxi_18;

public class HashDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("叶敏杨", 21);
        Student s2 = new Student("杨魏杰", 22);
        Student s3 = new Student("罗皓文", 22);

        System.out.println(s1.hashCode());//460141958
        System.out.println(s1.hashCode());//460141958

        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println("----------");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //默认情况下，不同对象的哈希值是不同的
        //通过方法重写，可以实现不同对象的哈希值是相同的

        System.out.println("----------");

        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("java".hashCode());
        System.out.println("world".hashCode());

        System.out.println("----------");

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        //字符串String重写了hashCode()方法
    }
}
