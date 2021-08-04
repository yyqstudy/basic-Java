package week2.IO流.字符流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
字符流读数据

构造方法
InputStreamReader(InputStream in):创建一个使用默认字符编码的InputStreamReader

读数据的2种方式
int read():一次读一个字符数据
int read(char[] cbuf):一次读一个字符数组数据

 */
public class CharacterStreamDemo04读数据 {
    public static void main(String[] args) throws IOException {
        //InputStreamReader(InputStream in):创建一个使用默认字符编码的InputStreamReader
        InputStreamReader isr = new InputStreamReader(new FileInputStream("/Users/yyq/Desktop/IBM课程10/Coursera_Capstone.ipynb"));

        //读数据
        //int read():一次读一个字符数据
      /*  int ch;
        while((ch=isr.read()) != -1){
            System.out.print((char)ch);
        }
        */

        //----------------------
        //int read(char[] cbuf):一次读一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while((len = isr.read(chs)) != -1){
            System.out.print(new String(chs, 0,len));
        }

        // 释放资源
        isr.close();
    }
}
