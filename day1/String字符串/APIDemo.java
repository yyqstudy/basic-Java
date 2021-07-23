package day1.String字符串;

import java.util.Scanner;

/*
要求：按照帮助文档的使用步骤学习Scanner类的使用，并实现键盘录入一个字符串，最后输出在console

Scanner 用于键盘录入数据（基本数据类型，字符串类型）

public String nextLine():获取键盘录入字符串类型
 */
public class APIDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //接收数据
        System.out.println("请输入一个字符串数据：");
        //String line = sc.nextLine();
        //输入sc.nextLine(),再用快捷键生成commend+option+V
        String line = sc.nextLine();

        //输出结果
        System.out.println("你输入的数据是："+line);
    }
}
