package week2.IO流.字符流.Case09至Case11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
集合到文件(数据排序改进版）
要求：键盘录入5个学生信息（姓名、语文成绩、数学成绩、 英语成绩）
     成绩总分从高到低写入文本
 格式：
 姓名、语文成绩、数学成绩、英语成绩
 举例：
 Tom,98,99,100

思路：
 1、定义学生类----另一个java文件
 2、创建TreeSet集合，通过比较器排序进行
 3、键盘录入学生数据---Scanner
 4、创建学生对象，把键盘录入到数据对应赋值给学生对象的成员变量
 5、把学生对象添加到TreeSet集合
 6、创建字符缓冲输出流对象---创建要写入的文件
 7、遍历集合，得到每一个学生对象
 8、把学生对象的数据拼接成指定格式的字符串---StringBuilder
 9、调用字符缓冲输出对象的方法写数据
 10、释放资源

 */
public class ArrayListToFile_GradeSorted {
    public static void main(String[] args) throws IOException {
        // 2、创建TreeSet集合，通过比较器排序进行
        TreeSet<StudentGrade> ts = new TreeSet<StudentGrade>(new Comparator<StudentGrade>() {
            @Override
            public int compare(StudentGrade s1, StudentGrade s2) {
                //成绩总分从高到低
                //主要条件
                int num = s2.getSum()-s1.getSum();
                //次要条件
                int num2 = num==0?s1.getChinese()-s2.getChinese() : num;
                int num3 = num2 == 0?s1.getMath()-s2.getMath() : num;
                int num4 = num3 == 0?s1.getName().compareTo(s2.getName()):num;
                return num4;


            }
        });

        //键盘录入学生数据---Scanner
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第"+(i+1)+"个学生信息：");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int Chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int Math = sc.nextInt();
            System.out.println("英文成绩：");
            int English = sc.nextInt();

            //4、创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
            StudentGrade sg = new StudentGrade();
            sg.setName(name);
            sg.setChinese(Chinese);
            sg.setMath(Math);
            sg.setEnglish(English);

            //5、把学生对象添加到TreeSet集合
            ts.add(sg);
        }

        // 6、创建字符缓冲输出流对象---创建要写入的文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("week2/IO流/字符流/Case09至Case11/ts.txt"));

        //7、遍历TreeSet集合，得到每一个学生对象
        for (StudentGrade sg: ts) {
            //8、把学生对象的数据拼接成指定格式的字符串---StringBuilder
            StringBuilder sb = new StringBuilder();
            sb.append(sg.getName()).append(",").append(sg.getChinese()).append(",").append(sg.getMath()).append(",").append(sg.getEnglish()).append(",").append(sg.getSum());
            // 9、调用字符缓冲输出对象的方法写数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        //10、释放资源
        bw.close();
    }
}
