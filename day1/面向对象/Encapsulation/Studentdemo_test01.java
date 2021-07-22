package day1.面向对象.Encapsulation;

import day1.面向对象.Student;

public class Studentdemo_test01 {
    public static void main(String[] args) {
        //创建对象
        Student_test01 s = new Student_test01();//class 名称要与至对应
        System.out.println(s);
        //使用对象
        //赋值
        s.name = "Albert";
        //s.age = 18;
        //s.age会报错，因为已经private
        s.setAge(-30);//此时输出是wrong input，但是出现0，是默认值
        //System.out.println(s.name+","+s.age);
        //使用成员方法
        s.show();


    }
}
