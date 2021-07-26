package week1.集合基础;

import java.util.ArrayList;

/*
要求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历集合
思路：
1、定义学生类--新建一个.java
2、创建集合对象
3、创建学生对象
4、添加学生对象到集合中
5、遍历集合--采用通用遍历格式实现
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();
        //创建学生对象--参考ArtistDemo.java
        //带参数
        Student s1 = new Student("Albert",18);
        Student s2 = new Student("Abey",17);
        Student s3 = new Student("Sylvia",16);
        //添加学生对象到集合中---array.add()
       array.add(s1);
       array.add(s2);
       array.add(s3);
       //遍历集合--采用通用遍历格式实现
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());

        }
    }
}
