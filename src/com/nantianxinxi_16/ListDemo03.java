package com.nantianxinxi_16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo03 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        Student s1 = new Student("叶敏杨", 21);
        Student s2 = new Student("罗皓文", 22);
        Student s3 = new Student("杨魏杰", 22);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //迭代器实现遍历list集合
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge() + "岁");
        }
        System.out.println("----------");

        //采用遍历索引来实现list集合的遍历
        for (int i = 0; i < list.size(); i++) {
            Student ss = list.get(i);
            System.out.println(ss.getName() + "," + ss.getAge() + "岁");
        }
        System.out.println("----------");
        //使用增强for来遍历list集合
        for (Student s : list){
            System.out.println(s.getName()+","+s.getAge()+"岁");
        }
        /*1.若只便利，采用增强for的方式，因为增强for是最方便的遍历方式。
          2.如果在操作的过程中使用到索引，那么只能选择普通for,因为普通for是带有索引的遍历方式。
          3.看需求选择迭代器方式。

         */
    }
}
