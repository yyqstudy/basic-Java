package week2.IO流.字节流ByteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
FileOutputStream:文件输出流用于数据写入file
FileOutputStream(String name):创建文件输出流以指定的名称写入文件
 */
public class ByteStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //FileOutputStream(String name):创建文件输出流以指定的名称写入文件
        FileOutputStream fos = new FileOutputStream("/Users/yyq/Desktop/bs4/fos.txt");
        //执行code之后已经创建好了txt，不必要使用createNewFile()

        /*这一行代码FileOutputStream fos = new FileOutputStream("/Users/yyq/Desktop/bs4/fos.txt");
        做了3件事：
        调用系统功能创建了文件；
        创建字节输出流对象；
        让字节输出流对象指向文件
         */

        //void write(int b):将指定的字节写入此文件输出流
        fos.write(97);
        //如果要输出显示是97，就先写9，再写7，这里的都是string
        fos.write(57);
        fos.write(55);
    }
}
