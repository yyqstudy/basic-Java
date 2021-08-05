package week2.IO流.字符流.Case09至Case11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
集合到文件(改进版）

要求：把ArrayList集合中的学生数据写入文本文件中。
     每一个学生元素作为文件中的一行数据

格式： 学号，姓名，年龄，居住地
举例：001, Albert, 30, Canada

思路：
1、定义学生类---在另一个java文件
2、创建ArrayList集合对象
3、创建学生对象
4、把学生对象添加到集合中
5、创建字符缓冲输出流对象
6、遍历集合，得到每一个学生对象
7、把学生对象的数据拼接成指定格式的字符串---拼接--StringBuilder
8、调用字符缓冲输出流对象方法写数据
9、释放资源
 */
public class ArrayListToFile_Upgraded {
    public static void main(String[] args) throws IOException {
        //2、创建ArrayList集合对象
        ArrayList<Student> array = new ArrayList<Student>();
        //3、创建学生对象
        Student s1 = new Student("001","Alice",17,"US");
        Student s2 = new Student("002","Albert",18,"USA");
        Student s3 = new Student("003","Brade",19,"Russia");

        //4、把学生对象添加到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //5、创建字符缓冲输出流对象---创建要写入的文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("week2/IO流/字符流/Case09至Case11/student.txt"));

        //6、遍历集合，得到每一个学生对象
        for (Student s:array) {
            //7、把学生对象的数据拼接成指定格式的字符串---StringBuilder
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());

            //8、调用字符缓冲输出流对象方法写数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        //9、释放资源
        bw.close();


    }
}
