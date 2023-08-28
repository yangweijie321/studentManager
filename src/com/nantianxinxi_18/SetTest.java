package com.nantianxinxi_18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> set = new HashSet<String>();

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");

        //遍历有两种方式：1.迭代器；2.增强for

        //1.迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("----------");

        //2.增强for
        for (String s : set){
            System.out.println(s);
        }
    }
}
