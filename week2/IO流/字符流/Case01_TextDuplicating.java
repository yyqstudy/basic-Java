package week2.IO流.字符流;

import java.io.*;

/*
案例：字符流复制Java文件

要求：把/Users/yyq/Desktop/bs4/Scientist.java复制到/Users/yyq/Desktop

思路：
1、根据数据源创建字节输入流对象
2、根据目的地创建字节输出流对象
3、读写数据，复制视频
4、释放资源

 */
public class Case01_TextDuplicating {
    public static void main(String[] args) throws IOException {
        //1、根据数据源创建字节输入流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("/Users/yyq/Desktop/bs4/Scientist.java"));

        //2、根据目的地创建字节输出流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/yyq/Desktop/Scientist.java"));


        //3、读写数据，复制视频
        //一次读写一个字符数据
        int ch;
        while((ch=isr.read()) != -1){
            osw.write(ch);
        }

        //一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while((len = isr.read(chs)) != -1){
            osw.write(chs,0,len);
        }
        /*
        write(String str, int off, int len)和write(char[] cbuf, int off, int len)有什么不同❓
        字符流的write(String str, int off, int len) 源码底层实现了getChars和write(char[] cbuf, int off, int len)，字节流不行
         */

        //4、释放资源
        isr.close();
        osw.close();
    }
}
