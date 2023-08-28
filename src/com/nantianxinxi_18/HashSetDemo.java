package com.nantianxinxi_18;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合对象

        HashSet<String> hs = new HashSet<String>();

        //添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("java");

        //增强for
        for (String s : hs){
            System.out.println(s);
        }

        System.out.println("----------");

        //迭代器
        Iterator<String> it = hs.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
