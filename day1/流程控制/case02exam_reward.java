package day1.流程控制;

/*
考试奖励
小明期末考试，根据不同的成绩获得不同奖励；
假如你输入成绩，程序实现小明应该获得什么样礼物，在控制台输出结果
奖励：
  95～100  山地自行车一辆
  90～94   游乐场玩一次
  80～89   变形金刚玩具一个
  80以下   胖揍一顿
 */

import java.util.Scanner;

public class case02exam_reward {
    public static void main(String[] args) {
        //成绩未知，采用键盘录入方式获取
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        //由于奖励种类过多，采用if…else if…else格式实现
        //为每种判断设置对应的条件
        //为每种判断设置对应的奖励
        //*****数据测试：正确数据；边界数据；错误数据****

        if(score>100 || score<0){
            System.out.println("你输入的数据有误");
        }else if (score>=95 && score<=100){
            System.out.println("山地自行车一辆");
        }else if (score>=90 && score<=94){
            System.out.println("游乐场玩一次");
        }else if (score>=80 && score<=89){
            System.out.println("变形金刚玩具一个");
        }else{
            System.out.println("胖揍一顿");
        }




    }
}
