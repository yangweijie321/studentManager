package com.nantianxinxi_17;

import java.util.LinkedList;

public class LinekedList {
    public static void main(String[] args) {
        //创建集合对象
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        System.out.println(linkedList);
        System.out.println("----------");

        linkedList.addFirst("javase");
        linkedList.addLast("javaee");
        System.out.println(linkedList);
        System.out.println("----------");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println("----------");

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

    }
}
