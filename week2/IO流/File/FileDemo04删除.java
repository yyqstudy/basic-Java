package week2.IO流.File;

import java.io.File;
import java.io.IOException;

/*
boolean delete():删除文件或者删除单级文件夹

 */
public class FileDemo04删除 {
    public static void main(String[] args) throws IOException {
        //在当前模块目录下创建headfirstJava.txt文件
        File f1 = new File("/Users/yyq/Desktop/bs4/headfirstJava.txt");
        //System.out.println(f1.createNewFile());//注意：是已经执行一次之后再注释掉，以免经常返回false

        //要求2：删除目录下headfirstJava.txt文件
        System.out.println(f1.delete());
        System.out.println("-----------");

        //要求3：创建headfirst目录
        File f2 = new File("/Users/yyq/Desktop/bs4/headfirst");
        System.out.println(f2.mkdir());
        System.out.println("-----------");

        //要求4：删除当前目录下headfirst目录
        System.out.println(f2.delete());
        System.out.println("-----------");

        //要求5：在当前目录下创建一个目录headfirst，然后在headfirst目录下创建一个文件headfirstJava.txt
        File f3 = new File("/Users/yyq/Desktop/bs4/headfirst");
        System.out.println(f3.mkdir());
        File f4 = new File("/Users/yyq/Desktop/bs4/headfirst/headfirstJava.txt");
        System.out.println(f4.createNewFile());
        System.out.println("-----------");

        //要求6：删除当前模块下的目录headfirst，里面的内容也要删除
        //不能直接f3.delete(),而是先删掉内容后删掉目录
        System.out.println(f4.delete());
        System.out.println(f3.delete());




    }

}
