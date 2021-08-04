package week2.IO流.字节流ByteStream;

import java.io.*;

/*
字节缓冲流
BufferOutputStream
BufferInputStream

构造方法：
字节缓冲输出流：BufferedOutputStream(OutputStream out)
字节缓冲输入流：BufferedInputStream(InputStream in)

 */
public class ByteStreamDemo07BufferedStream {
    public static void main(String[] args) throws IOException {
        //字节缓冲输出流：BufferOutputStream(OutputStream out)

        //FileOutputStream fos = new FileOutputStream("");
        //BufferedOutputStream bos = new BufferedOutputStream(fos);
        //可以写成一行代码

       /* BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/yyq/Desktop/bos.txt"));

        //写数据
        bos.write("hello\r".getBytes());
        bos.write("MIT\r".getBytes());

        //释放资源
        bos.close();*/


        //-----------------------
        //字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/yyq/Desktop/bos.txt"));

        //一次读取一个字节数据
        /*int by;
        while((by = bis.read())!= -1){
            System.out.print((char) by);
        }*/




        //
        byte[] bys = new byte[1024];
        int len;
        StringBuilder sb = new StringBuilder();
        while((len=bis.read(bys)) != -1){
            sb.append(new String(bys,0,len));
        }
        System.out.print(sb.toString());
        //System.out.print("hello\nMIT\n");
        //释放资源
        bis.close();






    }
}
