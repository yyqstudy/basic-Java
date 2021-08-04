package week2.IO流.字节流ByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
字节流写数据
构造方法：
FileOutputStream(String name):创建文件输出流以指定的名称写入文件
FileOutputStream(File file):创建文件输出流以写入由指定的File对象表示的文件

🌟🌟🌟这两种构造方法--查看源码--原理是一样的

三种方式
void write(int b):将指定的字节写入此文件输出流，一次写一个🌟字节🌟数据
void write(byte[] b)：将b.length字节从指定的字节数组写入此文件输出流，一次写一个🌟字节数组🌟数据
void write(byte[] b,int off,int len)：将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流，一次写一个字节数组的部分数据

 */
public class ByteStreamDemo02写数据 {
    public static void main(String[] args) throws IOException {
        //FileOutputStream(String name):创建文件输出流以指定的名称写入文件
        //FileOutputStream fos = new FileOutputStream("/Users/yyq/Desktop/bs4/fos.txt");

        //FileOutputStream(File file):创建文件输出流以写入由指定的File对象表示的文件
        File file = new File("/Users/yyq/Desktop/bs4/fos.txt");
        FileOutputStream fos2 = new FileOutputStream(file);

        //写数据

        //void write(int b):将指定的字节写入此文件输出流，一次写一个🌟字节🌟数据
        /*fos2.write(97);
        fos2.write(98);
        fos2.write(99);
        fos2.write(100);
        fos2.write(101);*/

        //--------------------
        //void write(byte[] b)：将b.length字节从指定的字节数组写入此文件输出流，一次写一个🌟字节数组🌟数据
       /* byte[] bys ={97,98,99,100,101};
        fos2.write(bys);*/
        //还可以更简单的方法---byte[] getBytes()---返回字符串对应的字节数组--command+option+V自动生成byte[] bytes
        byte[] bytes = "abcde".getBytes();
        //fos2.write(bytes);

        //--------------------
        //void write(byte[] b,int off,int len)：将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流，一次写一个字节数组的部分数据
        //fos2.write(bytes,0,bytes.length);
        fos2.write(bytes,1,3);

    }
}
