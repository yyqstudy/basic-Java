package day1.流程控制;
/*case穿透，等价于break删掉
在switch语句中，如果case后面的语句不写break，将出现穿透现象：在不判断下一个 case的情况下，向下运行，直到遇到break，或者整个switch语句结束
将switch的通常重复的代码变简单

案例： 一年有12个月，键盘录入一个月份，用程序实现判断该月份属于哪个季节，并输出
1、键盘录入月份数据，使用变量接收
2、多情况判断，采用switch语句实现---参考switch.java
3、在每种情况下，完成输出对应的季节

春： 3、4、5
夏： 6、7、8
秋： 9、10、11
冬： 1、2、12



 */

import java.util.Scanner;
public class case03season {
    public static void main(String[] args) {
        //键盘录入月份数据，使用变量接收
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个月份：");
        int month = sc.nextInt();
        //case 穿透
        //多情况判断，采用switch语句实现
        //在每种情况下，完成输出对应的季节
        switch(month) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("你输入的月份有误");
        }
    }
}
