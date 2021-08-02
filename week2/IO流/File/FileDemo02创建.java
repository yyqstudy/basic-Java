package week2.IO流.File;

import java.io.File;
import java.io.IOException;

/*
boolean createNewFile():指定路径不存在该文件时时创建新的空白文件
          如果文件不存在，就创建而且，返回true,
          如果文件存在，就不创建文件，否则返回false
boolean mkdir():当指定的单级文件夹不存在时创建File并返回true，否则返回false
boolean mkdirs():当指定的多级文件夹某一级文件夹不存在时,创建多级文件夹并返回true,否则返回false

 */
public class FileDemo02创建 {
    public static void main(String[] args) throws IOException {

        //要求：在Desktop/bs4目录下创建一个文件java.txt
        File f1 = new File("/Users/yyq/Desktop/bs4/java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("------------");

        //要求：在Desktop/bs4目录下创建一个目录JavaSE
        File f2 = new File("/Users/yyq/Desktop/bs4/JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("------------");

        //要求：在Desktop/bs4目录下创建一个多级目录JavaWEB/HTML
        File f3 = new File("/Users/yyq/Desktop/bs4/JavaWEB/HTML");
        System.out.println(f3.mkdirs());
        System.out.println("------------");

        //要求：在Desktop/bs4目录下创建一个文件javase.txt
        File f4 = new File("/Users/yyq/Desktop/bs4/Javase.txt");
        //System.out.println(f4.mkdir());//输出不报错，但是变成创建File而不是txt--用了mkdir()
        System.out.println(f4.createNewFile());//如果上一行code还执行的话，会return false，因为File和txt重名也不可以；所以要删掉上面创建的那个File
        System.out.println("------------");
    }
}
