package week1.流程控制;

/*
if else 语句格式
注意括号形式

 格式：
    if （关系表达式1）{
        语句体1；
    } else if（关系表达式2）{
        语句体2;
    }else if（关系表达式3）{
        语句体3;
    }
    ……
    else {
        语句体n+1；
    }

    执行流程：
    1.首先计算关系表达式1（即括号内）的值
    2.如果关系表达式1的值为true，执行语句体1；如果为false，计算关系表达式2的值
    3.如果关系表达式2的值为true，执行语句体2；如果为false，计算关系表达式3的值
    4.……
    5.继续执行语句体下方的语句内容
 */

import java.util.Scanner;

public class if_elseif_else {
    public static void main(String[] args) {
        System.out.println("开始");
        //要求：键盘输入一个星期数（1，2，……，7），输出对应星期一，星期二……星期日
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个星期数（1～7）：");
        int week = sc.nextInt();

        if (week == 1){
            System.out.println("星期一");
        } else if (week == 2){
            System.out.println("星期二");
        }else if (week == 3){
            System.out.println("星期三");
        }else if (week == 4){
            System.out.println("星期四");
        }else if (week == 5){
            System.out.println("星期五");
        }else if (week == 6){
            System.out.println("星期六");
        }else {
            System.out.println("星期日");
        }

        System.out.println("结束");
    }
}
