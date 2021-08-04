package week2.IO流.字节流ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
案例：字节流复制图片

要求：把"/Users/yyq/Desktop/bs4/wherehtml.png"复制到/Users/yyq/Desktop目录下面

思路：
1、根据数据源创建字节输入流对象
2、根据目的地创建字节输出流对象
3、读写数据，复制文本文件（一次读取一个字节数组，一次写入一个字节数组）
4、释放资源
 */
public class Case02_PhotoDuplicating {
    public static void main(String[] args) throws IOException {
        //1、根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("/Users/yyq/Desktop/bs4/wherehtml.png");
        //2、根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("/Users/yyq/Desktop/wherehtml.png");

        //读写数据，复制文本文件（一次读取一个字节数组，一次写入一个字节数组）
        byte[] bys = new byte[1024];//1024及其整数倍
        int len;
        while((len= fis.read(bys) )!= -1){
            fos.write(bys,0,len);
        }
        //释放资源
        fos.close();
        fis.close();


    }
}
