一、继承：
1.继承是Java面向对象的三大特征之一，子类可以继承父类的属性与方法，通过extends关键词实现。同时子类也可以有自己的方法，也可以重写父类的方法。
有关代码如下：
子类代码：                                                          父类代码：
package com.nantianxinxi_2;                                       package com.nantianxinxi_2
public class Zi extends Fu{                                       publick class Fu {                                              
    public Zi(){                                                     public Fu(){                                                                  
        System.out.println("Zi中的无参构造方法被调用");                      System.out.println("Fu中的无参构造方法被调用")                                         
    }                                                                }
    public Zi(int age){                                              public Fu(int age){
        System.out.println("Zi中的带参构造方法被调用");                      System.out.println("Fu中的带参构造方法被调用");
    }                                                                 }
}                                                                  }
2.super关键字:用于调用父类中的声明方法和属性。
父类主要代码：                                                       子类主要代码：
public class peInformation {                                      public class Student extends peInformation {
    private String name;                                               public Student() {}
    private int age;                                                   public Student(String name,int age){
                                                                               super(name,age);}
    public peInformation() {
    }
    public peInformation(String name, int age) {
        this.name = name;
        this.age = age;
    }
3.猫与狗案例：
父类Animal代码：                                                   子类Cat代码：
package com.nantianxinxi_4;                                      package com.nantianxinxi_4;
public class Animal {                                            public class Cat extends Animal {
    private String name;                                            public Cat(){}
    private int age;                                                public Cat(String name,int age){
    public Animal() {}                                                  super(name,age);
    public Animal(String name, int age) {                           }
        this.name = name;                                           public void zLs(){
        this.age = age;                                               System.out.println("猫抓老鼠");                                                               
    }                                                               }
    public String getName() {                                    }
        return name;                                       
    }
    public void setName(String name) {                          子类Dog代码:
        this.name = name;                                       package com.nantianxinxi_4;
    }                                                           public class Dog extends Animal {
    public int getAge() {                                         public Dog(){}
        return age;                                               public Dog(String name,int age){
                                                                          super(name,age);} 
    }                                                             public void kM(){
                                                                          System.out.println("狗看门");}
    public void setAge(int age) {                               }
        this.age = age;
    }
} 
测试类AnimalDemo代码：
package com.nantianxinxi_4;
public class AnimalDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("西梅");
        d1.setAge(1);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.kM();
        Dog d2 = new Dog("可乐",1);
        System.out.println(d2.getName()+","+d2.getAge());
        d2.kM();
        Cat c1 = new Cat();
        c1.setName("牛肉");
        c1.setAge(2);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.zLs();
        Cat c2 = new Cat("粉条",3);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.zLs();
    }
}

二、修饰符：修饰符分为（1）权限修饰符和（2）状态修饰符。
（1）权限修饰符：  修饰符             同一个类        同一个包中子类无关类        不同包的子类        不同包的无关类
               private              ✔                  ×                   ×                  ×   
                默认                 ✔                  ✔                   ×                  ×
              protected             ✔                  ✔                   ✔                  ×
               public               ✔                  ✔                   ✔                  ✔
（2）状态修饰符：1.final(最终态)、2.static(静态)。
1.final:可以修饰成员方法、成员变量、类。
（一）final修饰成员方法
父类代码：
public final void method(){System.out.println("Fu method");}
子类代码：
@Override
public void method(){System.out.println("Zi method");}//该重写方法在子类中报错
_被final修饰的方法叫最终方法，最终方法是不可以被重写的，但是继承了父类是可以被使用的。_
（二）final修饰成员变量
子类代码：
public final int age = 20 ;
public void show(){
    age = 100; //代码在这个位置报错
    System.out.println(age);
}
_被final修饰的成员变量就相当于常量，它是不可以在重新赋值，修改值的。_
（三）final修饰类
父类代码:
public final class  Fu(){}

子类代码：
public class Zi extends Fu{} //代码在这里报错
_Fu被final修饰，说明是最终类，则就不可能成为父类，所以就不可能有子类，所以Zi类就不能继承Fu类_ 

（四）final修饰基本类型变量
final int age = 20;
   age = 100; //代码在这里报错
   System.out.println(age);
_若final修饰的是基本类型，则其数据值不能发生改变_
（五）final修饰引用类型变量
final Student s = new Student();
s.age = 100;
System.out.println(age); //连同（四）代码，本段代码不报错。
_若final修饰的是引用类型，则其地址值不能发生改变，但是地址里面的内容可以发生改变_
2.static：
（一）static修饰特点：1.被类的所有对象共享（判断是否使用静态关键字的条件）；2.可以通过类名和对象名调用；
（二）static访问特点：1.非静态的成员方法：<能访问静态的成员变量>；<能访问非静态的成员变量>；<能访问静态的成员方法>；<能访问非静态的成员方法>
                   2.静态的成员方法：<能访问静态的成员变量>；<能访问静态的成员方法>
                   **静态成员方法只能访问静态成员**

三.多态（**实现前提和体现：1.有继承/实现关系 2.有方法重写 3.有父类引用指向子类对象**）
1.有关代码：
Animal类：                                                  Cat类：
package com.nantianxinxi_5;                                package com.nantianxinxi_5;
public class Animal {                                      public class Cat extends Animal{
    public void eat(){                                     @Override
        System.out.println("动物在吃东西");                  public void eat() {
    }                                                         System.out.println("猫吃鱼");}
}                                                          }
AnimalDemo:
package com.nantianxinxi_5;
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
    }
}

2.猫与狗案例（多态实现）
Animal类代码：                                               Cat类：
package com.nantianxinxi_6;                                package com.nantianxinxi_6;
public class Animal {                                      public class Cat extends Animal {
    private String name;                                       public Cat() {}
    private int age;                                           public Cat(String name, int age) {   
    public Animal() {                                            super(name, age);
    }                                                          }
    public Animal(String name, int age) {                  @Override
        this.name = name;                                      public void eat() {
        this.age = age;                                             System.out.println("猫吃鱼");
    }                                                          }
    public String getName() {                               }
        return name;
    }
    public void setName(String name) {                      Dog类
        this.name = name;                                   package com.nantianxinxi_6;
    }                                                       public class Dog extends Animal {
    public int getAge() {                                       public Dog() {}
        return age;                                             public Dog(String name, int age) {
    }                                                               super(name, age);
    public void setAge(int age) {                               }
        this.age = age;                                         @Override
    }                                                           public void eat() {
    public void eat(){                                              System.out.println("狗吃骨头");
        System.out.println("动物吃东西");                         }
    }                                                        }
}
Demo类：
package com.nantianxinxi_6;
public class Demo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("牛肉");
        a.setAge(1);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        a = new Cat("粉条", 2);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        a = new Dog();
        a.setName("西梅");
        a.setAge(1);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        a = new Dog("可乐",2);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}

                
                   
              