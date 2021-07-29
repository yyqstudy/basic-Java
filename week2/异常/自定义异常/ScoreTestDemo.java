package week2.异常.自定义异常;

/*
测试类
 */

import java.util.Scanner;

public class ScoreTestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = sc.nextInt();

        ScoreCheck scoreCheck = new ScoreCheck();
        try {
            scoreCheck.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }

    }
}
