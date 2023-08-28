package com.nantianxinxi_3;

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("叶敏杨");
        t1.setAge(24);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("杨魏杰",22);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();

        Student s1 = new Student();
        s1.setName("罗皓文");
        s1.setAge(10);
        System.out.println(s1.getName()+","+s1.getAge());
        s1.study();

        Student s2 = new Student("张熙文",9);
        System.out.println(s2.getName()+","+s2.getAge());
        s2.study();

    }
}
