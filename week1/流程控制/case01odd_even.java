package week1.流程控制;
/*
奇偶数判断
要求：任意给出一个整数，程序实现判断整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数
参考Scanner.java和if_else.java
分析：
1、采用键盘输入一个数据，参考Scanner.java
导包--创建对象--接收数据
2、判断奇偶分两种情况讨论，使用if_else结构
3、判断是否为偶数需要使用取余运算符实现： number%2 == 0
4、输出结果
 */

import java.util.Scanner;
public class case01odd_even {
    public static void main(String[] args) {
        //1、采用键盘输入一个数据，参考Scanner.java 导包--创建对象--接收数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        //2、判断奇偶分两种情况讨论，使用if_else结构
        //3、判断是否为偶数需要使用取余运算符实现： number%2 == 0
        //4、输出结果
        if (number%2 == 0){
            System.out.println(number + "是偶数");
        }else {
            System.out.println(number + "是奇数");
        }

    }
}
