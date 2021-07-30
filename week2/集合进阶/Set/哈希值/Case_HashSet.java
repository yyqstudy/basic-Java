package week2.集合进阶.Set.哈希值;

import java.util.HashSet;

/*
创建一个存储学生对象的集合，存储多个学生对象，使用程序实现在console遍历该集合
学生对象的成员变量值相同，就认为是同一个对象

思路：
1、定义学生类---Student_HashSet.java
2、创建HashSet集合对象
3、创建学生对象
4、把学生添加到集合
5、遍历集合（for each）
 */
public class Case_HashSet {
    public static void main(String[] args) {

        //创建HashSet集合对象
        HashSet<Student_HashSet> hs = new HashSet<Student_HashSet>();

        //创建学生对象
        Student_HashSet sh1 = new Student_HashSet("Alain",30);
        Student_HashSet sh2 = new Student_HashSet("Leonardo",31);
        Student_HashSet sh3 = new Student_HashSet("Alain",30);

        //把学生添加到集合
        //要重写hashCode()方法--command+N+I--equals() and hashCode()--保证内容相同的不再出现
        hs.add(sh1);
        hs.add(sh2);
        hs.add(sh3);

        //遍历集合
        for( Student_HashSet sh :hs){
            System.out.println(sh.getName()+","+sh.getAge());
        }

    }
}
