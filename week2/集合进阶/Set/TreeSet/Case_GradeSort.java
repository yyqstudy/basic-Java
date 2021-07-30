package week2.集合进阶.Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/*
要求：用TreeSet集合存储多个学生信息（姓名，语文成绩，数学成绩），并遍历该集合
    总分从高到低排序

思路：
1、定义学生类
2、创建TreeSet集合对象，通过比较器Comparator排序
3、创建学生对象
4、把学生对象添加到集合
5、遍历集合
 */
public class Case_GradeSort {
    public static void main(String[] args) {
        TreeSet<Grade> ts = new TreeSet<Grade>(new Comparator<Grade>() {
            @Override
            public int compare(Grade o1, Grade o2) {
                /*
                this.age-s.age  从小到大排序
                s.age-this.age  从大到小排序
                this -- o1 ; s--o2
                o1.getName()--string--可以直接使用compareTo()
                 */
                //过于麻烦，直接在Grade类中定义一个求总分到方法
                //int num = (o2.getChineseScore()+ o2.getMathScore())-(o1.getChineseScore()+o2.getMathScore());
                //🌟主要条件 题目给出
                int num = o2.getSum()-o1.getSum();
                //🌟次要条件———自己分析出来
                int num2 = num ==0 ? o1.getChineseScore()-o2.getChineseScore():num;
                int num3 = num2 ==0? o1.getName().compareTo(o2.getName()):num2;
                return num3;
            }
        });

        //创建学生对象
        Grade o1 = new Grade("Alice",98,100);
        Grade o2 = new Grade("Albert",95,95);
        Grade o3 = new Grade("Alain",100,93);
        Grade o4 = new Grade("Mike",100,97);
        Grade o5 = new Grade("Peter",98,98);

        Grade o6 = new Grade("Judy",97,99);//总分与o5一样，要修改比较器规则
        Grade o7 = new Grade("Lily",97,99);

        //添加到集合
        ts.add(o1);
        ts.add(o2);
        ts.add(o3);
        ts.add(o4);
        ts.add(o5);
        ts.add(o6);
        ts.add(o7);

        //遍历
        for (Grade o:ts
             ) {
            System.out.println(o.getName()+","+o.getChineseScore()+","+o.getMathScore()+","+o.getSum());
        }

    }
}
