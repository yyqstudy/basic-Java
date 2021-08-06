package week2.IO流.特殊操作流;

import java.io.PrintStream;

public class Demo02_SystemOut {
    public static void main(String[] args) {
        //public static final PrintStream out:标准输出流---显示输出
        PrintStream ps = System.out;
        //能够打印各种数据值
        ps.print("hell0");
        ps.print(100);

        //System.out的本质是一个字节输出流
        System.out.println("hello");
        System.out.println("100");
        System.out.println();

        //System.out.print();//报错，不存在print()
    }
}
