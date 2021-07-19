package day1.流程控制;
/*switch语句
格式：
    switch（表达式）{
      case 值1：
          语句体1;
          break;
      case 值2：
          语句体2;
          break;
      case 值3：
          语句体3;
          break;
      ……
      default：
          语句体n+1；
       }

     执行流程：
     1、首先计算关系表达式的值
     2、关系表达式的值依次与case后面的值进行比较，如果匹配，则执行相应的语句体，然后遇到break（用来结束switch语句），结束
     3、关系表达式的值都与case后面的值都不匹配，就会执行default里面的语句体，然后程序结束


 */


import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {

        System.out.println("开始");
        //要求：键盘输入一个星期数（1，2，……，7），输出对应星期一，星期二……星期日
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个星期数（1～7）：");
        int week = sc.nextInt();

        switch(week){
            case 1 :
                System.out.println("星期一");
                break;
            case 2 :
                System.out.println("星期二");
                break;
            case 3 :
                System.out.println("星期三");
                break;
            case 4 :
                System.out.println("星期四");
                break;
            case 5 :
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7 :
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数据有误");

        }
    }
}
