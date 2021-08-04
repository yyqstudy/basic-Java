package week2.IO流.字节流ByteStream;

import java.io.*;

/*
复制视频

要求：把/Users/yyq/Desktop/23G/快照功能.avi复制到桌面到"/Users/yyq/Desktop/快照功能.avi"
思路：
1、根据数据源创建字节输入流对象
2、根据目的地创建字节输出流对象
3、读写数据，复制视频
4、释放资源

四种方式实现：记录四种方式时间
 1、基本字节流---一次读写一个字节
 2、基本字节流---一次读写一个字节数组 //共耗时：74毫秒
 3、字节缓冲流---一次读写一个字节 //共耗时：351毫秒
 4、字节缓冲流---一次读写一个字节数组 //共耗时：24毫秒
 */
public class Case03_VideoDuplicating {
    public static void main(String[] args) throws IOException {

        //记录开始时间
        long startTime = System.currentTimeMillis();

        //调用复制视频方法
        //method1();
        //method2();
        //method3();
        method4();

        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时："+(endTime-startTime)+"毫秒");

    }

    //method1:基本字节流---一次读写一个字节
    public static void method1() throws IOException {
        //根据数据源创建字节输入流对象--Users/yyq/Desktop/23G/快照功能.avi
        FileInputStream fis = new FileInputStream("/Users/yyq/Desktop/23G/快照功能.avi");
        //根据目的地创建字节输出流对象--/Users/yyq/Desktop/快照功能.avi
        FileOutputStream fos = new FileOutputStream("/Users/yyq/Desktop/快照功能.avi");

        int by;
        while((by = fis.read()) != -1){
            fos.write(by);
        }
        fos.close();
        fis.close();

    }

    //method2:基本字节流---一次读写一个字节数组
    public static void method2() throws IOException {
        //根据数据源创建字节输入流对象--Users/yyq/Desktop/23G/快照功能.avi
        FileInputStream fis = new FileInputStream("/Users/yyq/Desktop/23G/快照功能.avi");
        //根据目的地创建字节输出流对象--/Users/yyq/Desktop/快照功能.avi
        FileOutputStream fos = new FileOutputStream("/Users/yyq/Desktop/快照功能.avi");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fos.close();
        fis.close();
    }

    //method3:字节缓冲流---一次读写一个字节
    public static void method3() throws IOException {
        //根据数据源创建字节输入流对象--Users/yyq/Desktop/23G/快照功能.avi
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/yyq/Desktop/23G/快照功能.avi"));
        //根据目的地创建字节输出流对象--/Users/yyq/Desktop/快照功能.avi
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/yyq/Desktop/快照功能.avi"));

        int by;
        while((by = bis.read()) != -1){
            bos.write(by);
        }
        bos.close();
        bis.close();
    }

    //method4:字节缓冲流---一次读写一个字节数组
    public static void method4() throws IOException {
        //根据数据源创建字节输入流对象--Users/yyq/Desktop/23G/快照功能.avi
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/yyq/Desktop/23G/快照功能.avi"));
        //根据目的地创建字节输出流对象--/Users/yyq/Desktop/快照功能.avi
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/yyq/Desktop/快照功能.avi"));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bos.close();
        bis.close();
    }


}
