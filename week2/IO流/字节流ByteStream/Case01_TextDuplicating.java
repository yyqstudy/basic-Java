package week2.IO流.字节流ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
案例：复制文本文件
要求：把"/Users/yyq/Desktop/bs4/fos.txt"复制到/Users/yyq/Desktop目录下面

分析：
1、复制文本文件，其实就是把文本文件内容从一个文件中读取出来（数据源），然后写入另一个文件（目的地）
2、数据源：
   /Users/yyq/Desktop/bs4/fos.txt --- 读数据 --- InputStream --- FileInputStream
3、目的地：
   /Users/yyq/Desktop/fos.txt --- 写数据 --- OutputStream  --- FileOutputStream

思路：
1、根据数据源创建字节输入流对象
2、根据目的地创建字节输出流对象
3、读写数据，复制文本文件（一次读取一个字节，一次写入一个字节）
4、释放资源
 */
public class Case01_TextDuplicating {
    public static void main(String[] args) throws IOException {

        //1、根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("/Users/yyq/Desktop/bs4/fos.txt");
        //2、根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("/Users/yyq/Desktop/fos.txt");

        //3、读写数据，复制文本文件（一次读取一个字节，一次写入一个字节）
        int by;
        while((by = fis.read()) != -1){
           fos.write(by);
        }
        //4、释放资源
        fos.close();
        fis.close();
    }
}

