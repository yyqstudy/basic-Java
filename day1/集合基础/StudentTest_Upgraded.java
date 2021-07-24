package day1.集合基础;
/*
要求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历集合
     学生姓名和年龄来自入键盘录入
思路：
1、定义学生类--新建一个.java
   为了键盘录入数据方便，把学生类中的成员变量定义为String类型
2、创建集合对象
3、键盘录入学生对象所需要的数据
4、创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
5、添加学生对象到集合中
6、遍历集合--采用通用遍历格式实现--在main（）
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest_Upgraded {
    public static void main(String[] args) {
        //创建集合对象--array是变量名
        ArrayList<Student_Upgraded> array = new ArrayList<Student_Upgraded>();

        //这块代码，要把输入动作重复3次，太麻烦--直接定义一个方法
        /*
        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        //无参数
        Student_Upgraded s = new Student_Upgraded();
        s.setName(name);
        s.setAge(age);
        //添加学生对象到集合中
        array.add(s);
        */

        //调用方法3次--用for循环实现
        for (int i = 0; i < 4; i++) {

            addStudent_Upgraded(array);

        }
        /*
        addStudent_Upgraded(array);
        addStudent_Upgraded(array);
        addStudent_Upgraded(array);
        */
        //遍历集合--采用通用遍历格式实现--在main（）
        for (int i = 0; i < array.size(); i++) {
            Student_Upgraded s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }

    //为了提高代码的复用性。我们用方法改进程序
     /*
    两个明确
      返回值类型 void--因为集合是引用类型，它在方法中改变，外面的集合也发生改变
      参数：ArrayList<Student_Upgraded> array
             --因为我们最终把数据给集合，所以把集合作为参数传送过去
     */
    public static void addStudent_Upgraded(ArrayList<Student_Upgraded> array){
        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        //无参数
        Student_Upgraded s = new Student_Upgraded();
        s.setName(name);
        s.setAge(age);
        //添加学生对象到集合中
        array.add(s);
    }









}
