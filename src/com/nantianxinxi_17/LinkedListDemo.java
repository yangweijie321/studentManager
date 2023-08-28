package com.nantianxinxi_17;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> linkedlist = new LinkedList<Student>();

        Student s1 = new Student("叶敏杨", 21);
        Student s2 = new Student("罗皓文", 22);
        Student s3 = new Student("杨魏杰", 22);

        linkedlist.add(s1);
        linkedlist.add(s2);
        linkedlist.add(s3);

        Iterator<Student> it = linkedlist.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge() + "岁");
        }
        System.out.println("----------");

        for (int i = 0; i < linkedlist.size(); i++) {
            Student s = linkedlist.get(i);
            System.out.println(s.getName() + "," + s.getAge() + "岁");
        }
        System.out.println("----------");

        for (Student s : linkedlist) {
            System.out.println(s.getName() + "," + s.getAge() + "岁");
        }
    }
}
