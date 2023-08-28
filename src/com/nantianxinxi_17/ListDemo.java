package com.nantianxinxi_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        //迭代器遍历数组
        Iterator<String> it = array.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("----------");

        //普通for循环来遍历数组
        for (int i=0;i<array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }
        System.out.println("----------");

        //增强for循环来遍历数组
        for (String s : array){
            System.out.println(s);
        }
        System.out.println("----------");

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        //迭代器遍历链表
        Iterator<String> lit = linkedList.iterator();

        while (lit.hasNext()){
            String ss = lit.next();
            System.out.println(ss);
        }
        System.out.println("----------");

        //普通for循环遍历链表
        for (int x=0;x<linkedList.size();x++){
            String ss = linkedList.get(x);
            System.out.println(ss);
        }
        System.out.println("----------");

        //增强for循环来遍历链表
        for (String ss : linkedList){
            System.out.println(ss);
        }
    }
}
