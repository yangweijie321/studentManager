package com.nantianxinxi_9;

public class Demo {
    public static void main(String[] args) {

        Paddler pp = new Paddler();
        pp.setName("林丹");
        pp.setAge(30);
        System.out.println(pp.getName()+","+pp.getAge()+"岁");
        pp.eat();
        pp.study();
        pp.studyEg();
        System.out.println("------------");

        Paddler ppp = new Paddler("马龙",28);
        System.out.println(ppp.getName()+","+ppp.getAge()+"岁");
        ppp.eat();
        ppp.study();
        ppp.studyEg();
        System.out.println("------------");

        hoopster ho = new hoopster();
        ho.setName("郭艾伦");
        ho.setAge(26);
        System.out.println(ho.getName()+","+ho.getAge()+"岁");
        ho.eat();
        ho.study();
        System.out.println("------------");

        hoopster hoo = new hoopster("周琦",24);
        System.out.println(hoo.getName()+","+hoo.getAge()+"岁");
        hoo.eat();
        hoo.study();
        System.out.println("------------");

        Tenniscoach tc = new Tenniscoach();
        tc.setName("刘国梁");
        tc.setAge(47);
        System.out.println(tc.getName()+","+tc.getAge()+"岁");
        tc.eat();
        tc.teach();
        tc.studyEg();
        System.out.println("------------");

        Tenniscoach tcc = new Tenniscoach("孔令辉",47);
        System.out.println(tcc.getName()+","+tcc.getAge()+"岁");
        tcc.eat();
        tcc.teach();
        tcc.studyEg();
        System.out.println("------------");

        Bkcoach bc = new Bkcoach();
        bc.setName("杨鸣");
        bc.setAge(38);
        System.out.println(bc.getName()+","+bc.getAge()+"岁");
        bc.eat();
        bc.teach();
        System.out.println("------------");

        Bkcoach bcc = new Bkcoach("易建联",36);
        System.out.println(bcc.getName()+","+bcc.getAge()+"岁");
        bcc.eat();
        bcc.teach();

    }
}
