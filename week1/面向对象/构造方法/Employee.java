package week1.面向对象.构造方法;
/*
构造方法：
作用：创建对象
功能：完成对象数据的初始化

格式：
 public class 类名{
    修饰符 类名（参数）{

    }
 }
修饰符一般用 public
 */
public class Employee {
    private String name;
    private int age;

    //
    public Employee(){
        System.out.println("无参构造方法");
    }
    public void show(){
        System.out.println(name+","+age);
    }

}
