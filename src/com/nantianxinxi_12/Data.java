package com.nantianxinxi_12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1);

        long date = 1000*60*60;
        Date d2 = new Date(date);
        System.out.println(d2);

        Date d3 = new Date();
        //System.out.println(d3.getTime());
        //System.out.println(d3.getTime()*1.0/1000/60/60/24/365+"年");

        //long time = 1000*60*60;
        long time = System.currentTimeMillis();
        d3.setTime(time);

        System.out.println(d3);
//格式化：从Date到String
        Date d4 = new Date();
        //SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH ：mm ：ss");
        String s = sdf.format(d4);
        System.out.println(s);
        System.out.println("------------");

        //从String到Date
        String ss = "2023-08-22 11:30:30";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd);


    }
}
