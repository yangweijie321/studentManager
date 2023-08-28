package com.nantianxinxi_15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");

        Iterator<String> it = c.iterator();

/*
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());//NoSuchElementException
        */
/*
        if (it.hasNext()){
            System.out.println(it.next());
        }
        if (it.hasNext()){
            System.out.println(it.next());
        }
        if (it.hasNext()){
            System.out.println(it.next());
        }
        if (it.hasNext()){
            System.out.println(it.next());
        }
        */
        while (it.hasNext()){
            //System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
        }
    }
}
