package com.nantianxinxi_15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo04 {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();

        Student s1 = new Student();
        s1.setName("叶敏杨");
        s1.setAge(21);
        c.add(s1);

        Student s2 = new Student("罗皓文",22);
        c.add(s2);

        Student s3 = new Student("杨魏杰",22);
        c.add(s3);


        Iterator<Student> it = c.iterator();

        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }


    }
}
