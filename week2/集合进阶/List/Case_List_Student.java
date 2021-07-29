package week2.集合进阶.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
要求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在console遍历该集合

思路：
1、定义学生类---另外一个java文件
测试类：
2、创建List集合对象
3、创建学生对象
4、把学生添加到集合
5、遍历集合（迭代器方式、for循环、增强for）
 */
public class Case_List_Student {
    public static void main(String[] args) {
        //创建List集合对象
        List<StudentList> l = new ArrayList<StudentList>();
        //创建学生对象
        StudentList sl1 = new StudentList("Ross",20);
        StudentList sl2 = new StudentList("Joey",20);
        StudentList sl3 = new StudentList("Calder",21);

        //把学生添加到集合
        l.add(sl1);
        l.add(sl2);
        l.add(sl3);

        Iterator<StudentList> it = l.iterator();
        while(it.hasNext()){
            StudentList sl = it.next();
            System.out.println(sl.getName()+","+sl.getAge());
        }
        System.out.println("------------");

        //for循环
        for (int i = 0; i < l.size(); i++) {
            StudentList sl = l.get(i);
            System.out.println(sl.getName()+","+sl.getAge());
            //System.out.println(l.get(i));//为什么这里输出的是List.StudentList@610455d6
        }
        System.out.println("------------");

        //增强for
            for (StudentList sll:l) {
                System.out.println(sll.getName()+","+sll.getAge());
            }


    }
}
