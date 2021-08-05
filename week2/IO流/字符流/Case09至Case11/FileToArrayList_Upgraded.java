package week2.IO流.字符流.Case09至Case11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
文件到集合（改进版）

要求：把文本文件中的数据读取到集合中，并遍历集合。要求：文件中每一行数据都是一个学生对象的成员变量值
    举例：001，Alice，17，US
    这个在console输出

思路：
 1、定义学生类---在另一个java文件中
 2、创建字符缓冲输入流对象---要读取的文件
 3、创建ArrayList集合对象
 4、调用字符缓冲输入流对象的方法读数据
 5、把读取到到字符串数据用split()进行分隔，得到一个字符串数组
 6、创建学生对象
 7、把字符串数组中的每一个元素取出来对应赋值给学生对象的成员变量值
 8、把学生对象添加到集合
 9、释放资源
 10、遍历集合
 */
public class FileToArrayList_Upgraded {
    public static void main(String[] args) throws IOException {
        // 2、创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("week2/IO流/字符流/Case09至Case11/student.txt"));

        //3、创建ArrayList集合对象
        ArrayList<Student> arr = new ArrayList<Student>();

        //4、调用字符缓冲输入流对象的方法读数据
        String line;
        while((line = br.readLine()) != null){
            //5、把读取到到字符串数据用split()进行分隔，得到一个字符串数组
            String[] strArray = line.split(",");

            // 6、创建学生对象
            Student s = new Student();

            //7、把字符串数组中的每一个元素取出来对应赋值给学生对象的成员变量值
            //001，Alice，17，US
            s.setSid(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(Integer.parseInt(strArray[2]));//年龄定义是int类型，所以要把string类型转换成int类型---Integer.parseInt()
            s.setAddress(strArray[3]);

            // 8、把学生对象添加到集合
            arr.add(s);

        }
        // 9、释放资源
        br.close();

        //10、遍历集合
        for (Student s: arr) {
            System.out.println(s.getSid()+","+s.getName()+","+s.getAge()+","+s.getAddress());
        }

    }
}
