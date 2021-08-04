package week2.IO流.字节流ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
要求：把文件fos.txt的内容读取出来，在console输出
FileInputStream：从文件系统中的文件获取输入字节
 FileInputStream(String name):通过打开与实际文件的连接来创建一个FileInputStream，该文件由文件系统中的路径名name命名

使用字节输入流读数据步骤：
1、创建字节输入流对象FileInputStream(String name)
2、调用字节输入流对象的读数据方法---int read():从输入流读取一个字节的数据
3、释放资源


 */
public class ByteStreamDemo05读字节数据 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象FileInputStream(String name)
        FileInputStream fis = new FileInputStream("/Users/yyq/Desktop/bs4/fos.txt");

        //调用字节输入流对象的读取数据方法
        //int read():从输入流读取一个字节的数据

       /* //方法一（麻烦）
        //第一次读取数据
        int by = fis.read();
        System.out.println(by);
        System.out.println((char)by);

        //第二次读取数据
        by = fis.read();
        System.out.println(by);
        System.out.println((char)by);

        //再多读取两次
        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);
        //如果到了文件末尾：-1*/

        //---------------
        //while循环改进
        /*int by = fis.read();
        while(by != -1){
            System.out.print((char)by);
            by = fis.read();
        }
*/
        //---------------
        //优化while循环程序---标准的字节流读数据格式
        int by;
        while((by=fis.read()) != -1){
            System.out.print((char)by);
        }
        /*
        ((by=fis.read()) != -1)实现了3件事情：
        fis.read(); 读数据
        by=fis.read();把读取的数据赋值给by
        by != -1; 判断读取的数据是否是-1
         */

        //
        fis.close();


    }
}
