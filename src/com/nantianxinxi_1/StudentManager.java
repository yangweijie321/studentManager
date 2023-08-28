package com.nantianxinxi_1;


import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args){
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("--------" + "欢迎来到学生管理系统" + "--------");
            System.out.println("1 添加学生信息");
            System.out.println("2 删除学生信息");
            System.out.println("3 修改学生信息");
            System.out.println("4 查看所有学生信息");
            System.out.println("5 退出系统");
            System.out.println("请输入您要进行的操作: ");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    addStudent(array);
                    //System.out.println("添加学生信息");
                    break;
                case "2":
                    deleteStudent(array);
                    //System.out.println("删除学生信息");
                    break;
                case "3":
                    updateStudent(array);
                    //System.out.println("修改学生信息");
                    break;
                case "4":
                    //System.out.println("查看所有学生信息");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢您的使用！");
                    //break;
                    System.exit(0);//JVM退出
            }
        }
    }

    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);

        String sid;

        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("您输入的学号已被使用，请重新输入！");
            }else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        Student s  = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);

        System.out.println("添加学生信息成功！");


    }

    public static void findAllStudent(ArrayList<Student> array){
        if (array.size()==0){
            System.out.println("无学生信息，请先添加信息");
            return;//为了让程序不在往下执行
        }

        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");

        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"岁\t"+s.getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您要删除的学生的学号: ");
        String sid = sc.nextLine();
        int index = -1;

        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("该学生信息不存在，请重新输入！");
        }else {
            array.remove(index);
            System.out.println("删除学生信息成功");
        }
    }

    public static void updateStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        int index = -1;


        System.out.println("请输入您要修改的学生的学号：");
        String sid = sc.nextLine();

        for (int i=0;i<array.size();i++){
            Student student = array.get(i);
            if (student.getSid().equals(sid)){
                index = i;
                break;
            }
        }

        if (index == -1){
            System.out.println("该学生信息不存在，请重新输入！");
        }else {

            System.out.println("请输入学生的新姓名");
            String name = sc.nextLine();

            System.out.println("请输入学生的新年龄");
            String age = sc.nextLine();

            System.out.println("请输入学生的新居住地");
            String address = sc.nextLine();

            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);

            array.set(index,s);
            System.out.println("修改学生信息成功！");
        }

    }

    public static boolean isUsed(ArrayList<Student> array,String sid){
        boolean flag = false;

        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                flag = true;
                break;
            }else {

            }
        }
        return  false;
    }
}
