package week2.IO流.字节流ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*

 */
public class ByteStreamDemo06读字节数组 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象FileInputStream(String name)
        FileInputStream fis = new FileInputStream("/Users/yyq/Desktop/fos.txt");

        //调用字节输入流对象的读数据方法
        //int read(byte[] b):从输入流读取最多b.length个字节的数据到一个字节数组
      /*  byte [] bys = new byte[5];

        //第一次读取数据
        int len = fis.read(bys);
        System.out.println(len);//输出--5
        //String(byte[] bytes)
        System.out.println(new String(bys,0,len));//输出--hello
        *//*
        弹幕解析：
        解释bys为什么会有数据---因为通过fis.read(bys),把数据放进bys数组中
        而len是判断bys数组的长度，若没有数据，则bys没有长度，返回-1

         *//*
        //第二次读取数据
         len = fis.read(bys);
        System.out.println(len);//输出--5
        //***String(byte[] bytes)
        //System.out.println(new String(bys));//输出--换行两次+wor
        System.out.println(new String(bys,0,len));

        *//*
        hello\r
        world\r

        第一次：hello
        第二次：\rworl
        第三次：d\rorl---数组长度是5，前面两个替换，后面三个没有替换，还是按第二次输出--优化用String(byte[] bytes, int offset,int length)
         *//*
        //再多读两次
        len = fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys,0,len));
        len = fis.read(bys);
        System.out.println(len);
       */

        //-------------------
        byte[] bys = new byte[1024];//1024及其整数倍
        int len;
        while((len= fis.read(bys) )!= -1){
            System.out.print(new String(bys,0,len));//0是索引，len是数组实际长度
        }

        //释放资源
        fis.close();

    }
}
