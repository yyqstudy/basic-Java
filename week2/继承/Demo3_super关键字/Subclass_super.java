package week2.继承.Demo3_super关键字;

import week2.继承.Demo2_variable.Superclass_variable;

public class Subclass_super extends Superclass_variable {

    //年龄
    public int age = 20;
    public void show(){
        int age = 30;
        System.out.println(age);
        //要访问本类都成员变量age(public int age = 20;)--how--用this
        System.out.println(this.age);
        //要访问父类都成员变量age
        System.out.println(super.age);

    }
}
