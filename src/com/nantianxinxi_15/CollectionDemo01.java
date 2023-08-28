package com.nantianxinxi_15;

import java.util.ArrayList;

import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建collection集合的对象
        Collection<String> c = new ArrayList<String>();//ArrayList中重写了ToString方法

        //添加元素：boolean add(E e)
        c.add("hello");
        c.add("world");
        c.add("java");

        //输出集合对象
        System.out.println(c);
    }

}
