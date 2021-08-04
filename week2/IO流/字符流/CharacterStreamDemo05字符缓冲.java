package week2.IO流.字符流;

import java.io.*;

/*
字符缓冲流
构造方法
BufferedWriter(Write out)
BufferedReader (Reader in)
 */
public class CharacterStreamDemo05字符缓冲 {
    public static void main(String[] args) throws IOException {
        //BufferedWriter(Write out)
        /*
        FileWriter fw = new FileWriter("/Users/yyq/Desktop/bs4/bw.txt");
        BufferedWriter bw = new BufferedWriter(fw)
        以上两行代码合并成下方一行代码
         */
      /*  BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/yyq/Desktop/bs4/bw.txt"));
        bw.write("hello\r");
        bw.write("MIT\r");

        //释放资源
        bw.close();*/

        //----------------------
        //BufferedReader (Reader in)
        BufferedReader br = new BufferedReader(new FileReader("/Users/yyq/Desktop/bs4/bw.txt"));

        //一次读取一个字符数据
    /*    int ch;
        while((ch = br.read()) != -1){
            System.out.print((char)ch);
        }*/

        //一次读取一个字符数组
        char[] chs = new char[1024];
        int len;
        while((len=br.read(chs)) != -1){
            System.out.println(new String(chs,0,len));
        }




    }
}
