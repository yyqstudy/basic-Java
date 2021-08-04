package week2.IO流.字节流ByteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
字节流写数据的两个小问题
如何实现换行？
windows:\r\n
linux:\n
mac:\r

如何实现追加写入？
public FileOutputStream(String name, boolean append)
创建文件输出流以指定的名称写入文件
如果第二个参数boolean append为true，则字节将写入文件的末尾而不是开头

 */
public class ByteStreamDemo03换行和追加写入 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //FileOutputStream fos = new FileOutputStream("/Users/yyq/Desktop/bs4/fos.txt");
        //实现追加写入
        FileOutputStream fos = new FileOutputStream("/Users/yyq/Desktop/bs4/fos.txt",true);

        //写数据
        for (int i = 0; i <10 ; i++) {
            fos.write("hello".getBytes());
            fos.write("\r".getBytes());


        }
        //释放资源
        fos.close();
    }
}
