package week2.集合进阶.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
要求：ArrayList存储学生对象，使用Collections对ArrayList进行排序
    按照年龄从小到大排序；年龄相同时候，按照姓名的字母顺序排序

思路：
1、定义学生类---在另一个java文件
2、创建ArrayList集合对象
3、创建学生对象
4、把学生添加到集合
5、使用Collections对ArrayList集合进行排序 🌟🌟🌟与之前区别的不同之处
6、遍历集合
 */
public class Case01CollectionsDemo2 {
    public static void main(String[] args) {
        //创建ArrayList集合对象--存储学生对象--类型是Student
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("Harry James Potter",15);
        Student s2 = new Student("Hermione Jean Granger",16);
        Student s3 = new Student("Ronald Bilius",15);
        Student s4 = new Student("Tom Marvolo Riddles",17);

        //把学生添加到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        //使用Collections对ArrayList集合进行排序
        // sort(List<T>list, Comparator<? superT>c)
        ////new Comparator<>(){} --- 匿名内部类
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //下面写Comparator指定的规则
                //按照年龄从小到大排序
                //年龄相同时候，按照姓名的字母排序
                //this.age-s.age  从小到大排序
                //s.age-this.age  从大到小排序
                //this -- o1 ; s--o2
                //o1.getName()--string--可以直接使用compareTo()
                int num = o1.getAge()-o2.getAge();
                int num2 = num == 0? o1.getName().compareTo(o2.getName()):num;
                return num2;
            }
        });
        //遍历集合
        for (Student s:array
             ) {
            System.out.println(s.getName()+","+s.getAge());
        }



    }
}
