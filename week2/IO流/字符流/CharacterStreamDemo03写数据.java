package week2.IO流.字符流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
构造方法
OutputStreamWriter(OutputStream out):创建一个使用默认字符编码的OutputStreamWriter

字符流写数据的5种方式

void write(int c) 写一个字符
void write(char[] cbuf) 写入一个字符数组
void write(char[] cbuf, int off, int len) 写入字符数组的一部分
void write(String str) 写一个字符串
void write(String str, int off, int len)  写一个字符串的一部分

flush()---刷新流，还可以继续写数据（在txt中有输出）
close()---关闭流，释放资源，但是在关闭之前会先运行刷新流；一旦关闭，就不能再写数据（在txt中无输出）
 */
public class CharacterStreamDemo03写数据 {
    public static void main(String[] args) throws IOException {

        //OutputStreamWriter(OutputStream out):创建一个使用默认字符编码的OutputStreamWriter
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/yyq/Desktop/bs4/osw.txt"));

        //void write(int c) 写一个字符
        osw.write(97);//如果之后的代码没有void flush():刷新流-----创建的txt文件没有输出
        //void flush():刷新流
        osw.flush();
        osw.write(98);
        osw.flush();
        osw.write(99);//之后的代码写了 void close()---先刷新再关闭---也可以在txt文件中显示

        //------------------------
        //void write(char[] cbuf) 写入一个字符数组
        char[] chs = {'a','b','c','d','e'};
        osw.write(chs);

        //------------------------
        //void write(char[] cbuf, int off, int len) 写入字符数组的一部分
        char[] chs1 = {'a','b','c','d','e'};
        osw.write(chs1,1,3);


        //------------------------
        //void write(String str) 写一个字符串
        osw.write("ffff");

        //------------------------
        //void write(String str, int off, int len)  写一个字符串的一部分
        osw.write("Yale",0,"Yale".length());



        //释放资源
        osw.close();


    }
}
