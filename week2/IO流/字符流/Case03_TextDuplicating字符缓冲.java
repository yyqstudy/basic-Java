package week2.IO流.字符流;

import java.io.*;

/*
案例：字符流复制Java文件---字符缓冲改进版

要求：把/Users/yyq/Desktop/bs4/Scientist.java复制到/Users/yyq/Desktop/Scientist.java


思路：
    1、根据数据源创建字节输入流对象
    2、根据目的地创建字节输出流对象
    3、读写数据，复制视频
    4、释放资源
 */
public class Case03_TextDuplicating字符缓冲 {
    public static void main(String[] args) throws IOException {
        // 1、根据数据源创建字节输入流对象
        BufferedReader br = new BufferedReader(new FileReader("/Users/yyq/Desktop/bs4/Scientist.java"));
        //2、根据目的地创建字节输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/yyq/Desktop/Scientist.java"));

        //3、读写数据，复制视频
        //一次读写一个字符数据
       /* int ch;
        while((ch = br.read()) != -1){
            bw.write(ch);
        }*/
        //-------------------
        //一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while((len = br.read(chs)) != -1){
            bw.write(chs,0,len);
        }
        //4、释放资源
        br.close();
        bw.close();

    }
}
