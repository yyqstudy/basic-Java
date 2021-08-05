package week2.IO流.字符流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/*
集合到文件

要求：把ArrayList集合中的字符串数据写入文本文件中。
     每一个字符串元素作为文件中的一行数据

思路：
1、创建ArrayList集合
2、往集合中存储字符串元素
3、创建字符缓冲输出流对象
4、遍历集合，得到每一个字符串数据
5、调用字符缓冲输出流对象的方法写数据
6、释放资源

 */
public class Case06_ArrayListToText {
    public static void main(String[] args) throws IOException {
        //1、创建ArrayList集合
        ArrayList<String> array = new ArrayList<String>();

        //2、往集合中存储字符串元素
        array.add("hello");
        array.add("Doooooo");

        //3、创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("./week2/IO流/字符流/array1.txt"));

        //4、遍历集合，得到每一个字符串数据
        for (String s: array) {
            //5、调用字符缓冲输出流对象的方法写数据
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        //6、释放资源
        bw.close();
    }
}
