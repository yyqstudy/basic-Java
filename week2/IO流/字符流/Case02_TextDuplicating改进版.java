package week2.IO流.字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Case02_TextDuplicating改进版 {
    public static void main(String[] args) throws IOException {
        // 1、根据数据源创建字节输入流对象
        FileReader fr = new FileReader("/Users/yyq/Desktop/bs4/Scientist.java");

        //2、根据目的地创建字节输出流对象
        FileWriter fw = new FileWriter("/Users/yyq/Desktop/Scientist.java");

        //3、读写数据，复制视频
        //一次读写一个字符数据
        /*int ch;
        while((ch = fr.read()) != -1){
            fw.write(ch);
        }*/

        //----------------
        //一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while((len = fr.read(chs)) != -1){
            fw.write(chs,0,len);
        }

        // 4、释放资源
        fr.close();
        fw.close();
    }
}
