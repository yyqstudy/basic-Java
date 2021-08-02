package week2.IO流.File;
/*
构造方法

File(String pathname) :将一个给定的字符串路径转换为抽象路径来创建新的File实例
File(String parent,String child):传入一个父级路径和子级路径字符串创建新的File类型
File(File parent,String child):传入一个父级抽象路径和子级路径字符串创建新的File类型

\\转义字符表示 \
\
 */
import java.io.File;

public class FileDemo01构造 {
    public static void main(String[] args) {
       //File(String pathname) :将一个给定的字符串路径转换为抽象路径来创建新的File实例
        File f1 = new File("/Users/yyq/Desktop/bs4/tests.file");
        System.out.println(f1);

        //File(String parent,String child):传入一个父级路径和子级路径字符串创建新的File类型
        File f2 = new File("/Users/yyq/Desktop/bs4","tests.file");
        System.out.println(f2);

        //File(File parent,String child):传入一个父级抽象路径和子级路径字符串创建新的File类型
        File f3 = new File("/Users/yyq/Desktop/bs4");
        File f4 = new File(f3,"tests.file");
        System.out.println(f4);


    }
}
