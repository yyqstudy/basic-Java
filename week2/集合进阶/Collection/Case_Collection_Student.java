package week2.集合进阶.Collection;
/*
要求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在console遍历该集合

思路：
1、定义学生类---另外一个java文件
测试类：
2、创建Collection集合对象
3、创建学生对象
4、把学生添加到集合
5、遍历集合（迭代器方式）
 */

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//测试类
public class Case_Collection_Student {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<StudentClass> c = new ArrayList<StudentClass>();

        //创建学生对象
        StudentClass  s1 = new StudentClass("Alice",17);
        StudentClass  s2 = new StudentClass("Abey",18);
        StudentClass  s3 = new StudentClass("Albert",17);

        //把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);

        //遍历集合（迭代器方式）
        Iterator<StudentClass> it = c.iterator();
        while(it.hasNext()){
            StudentClass s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
    }


}
