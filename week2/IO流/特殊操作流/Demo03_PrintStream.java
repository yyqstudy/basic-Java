package week2.IO流.特殊操作流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo03_PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        //PrintStream(String  fileName):使用指定的文件名创建新的打印流
        //创建字节打印流对象
        PrintStream ps = new PrintStream("./week2/IO流/特殊操作流/ps.txt");

        //写数据
        //字节输出流方法--父类--write()
        ps.write(97);//输出是a

        //使用特有的方法写数据---print()
        ps.println();
        ps.println(97);//输出是97
        ps.print(98);//输出是98

        //释放资源
        ps.close();


    }
}
