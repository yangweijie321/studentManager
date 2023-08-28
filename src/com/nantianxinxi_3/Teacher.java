package com.nantianxinxi_3;

public class Teacher extends peInformation {

    public Teacher(){

    }

    public Teacher(String name,int age){
        super(name,age);
    }


    public void teach(){
        System.out.println("孜孜不倦，教书育人");
    }
}
