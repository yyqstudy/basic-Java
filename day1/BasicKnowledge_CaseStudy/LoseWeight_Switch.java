package day1.BasicKnowledge_CaseStudy;

/*
要求：输入星期数，显示今天的减肥活动
周一：跑步
周二：游泳
周三：慢走
周四：动感单车
周五：拳击
周六：爬山
周日：好好吃一顿

思路：
1、键盘录入一个星期数，用一个变量接收
2、对星期数进行判断,用switch语句实现
3、在对应对语句控制中输出对应的减肥活动

导包：
手动导包：import java.util.Scanner;
自动导包：输入Sc+回车键
快捷键导包：option+回车键

 */


import java.util.Scanner;

//类同于流程控制中exam_reward.java
public class LoseWeight_Switch {
    public static void main(String[] args) {
        //输入一个星期数，用变量接收

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数");
        int week = sc.nextInt();
        //对星期数进行判断,用switch语句实现
        switch(week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                 System.out.println("爬山");
                 break;
            case 6:
                System.out.println("好好吃一顿");
                break;
            case 7:
                System.out.println("跑步");
                break;
            default:
                    System.out.println("你输入的星期数有误");

        }
    }
}
