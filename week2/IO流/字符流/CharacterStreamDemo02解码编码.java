package week2.IO流.字符流;

import java.io.*;

/*
InputStreamReader:是从字节流到字符流的桥梁
      读取字节并且解码
      使用的字符集可以是默认平台，或者是指定的
      InputStreamReader(InputStream in) 创建一个使用默认字符编码的InputStreamReader
      InputStreamReader(InputStream in, String charsetName) 创建一个使用命名字符编码的InputStreamReader

OutputStreamWriter:是从字符流到字节流的桥梁
      写入字符并且编码
      使用的字符集可以是默认平台，或者是指定的
      OutputStreamWriter(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter
      OutputStreamWriter(OutputStream out, String charsetName) 创建一个使用命名字符编码的OutputStreamWriter



 */
public class CharacterStreamDemo02解码编码 {
    public static void main(String[] args) throws IOException {
        //编码
        //默认平台字符集编码

        /*
        FileOutputStream fos = new FileOutputStream("/Users/yyq/Desktop/osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        上面两行合并成下面一行代码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/yyq/Desktop/osw.txt"));
         */

        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/yyq/Desktop/osw.txt"));
        //指定字符集编码
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/yyq/Desktop/osw.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/yyq/Desktop/osw.txt"),"GBK");
        osw.write("中国");
        osw.close();



        //解码

        //默认平台字符集
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("/Users/yyq/Desktop/osw.txt"));
        //指定字符集编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("/Users/yyq/Desktop/osw.txt"),"GBK");

        //一次读取一个字节数据
        int ch;
        while((ch= isr.read()) != -1){
            System.out.print((char)ch);
        }
        isr.close();




    }
}
