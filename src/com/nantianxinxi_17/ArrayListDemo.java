package com.nantianxinxi_17;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("叶敏杨", 21);
        Student s2 = new Student("罗皓文", 22);
        Student s3 = new Student("杨魏杰", 22);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        Iterator<Student> it = array.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge() + "岁");
        }
        System.out.println("----------");

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge() + "岁");
        }
        System.out.println("----------");

        for (Student s : array) {
            System.out.println(s.getName() + "," + s.getAge() + "岁");
        }
    }
}
