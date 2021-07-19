package day1.流程控制;
/*
if 语句格式

 格式：
    if （关系表达式）{
        语句体；
    }
    执行流程：
    1.首先计算关系表达式（即括号内）的值
    2.如果关系表达式的值为true，执行语句体；如果为false，跳过不执行语句体
    3.继续执行语句体下方的语句内容
 */
public class If {
    public static void main(String[] args) {
        System.out.println("开始");

        //定义两个变量
        int a = 10;
        int b = 20;

        //要求：判断a和b的值是否相等，如果相等，就输出：a等于b
        if (a == b){
            System.out.println("a等于b");
        }
        //要求：判断a和c的值是否相等，如果相等，就输出：a等于c
        int c = 10;
        if (a == c){
            System.out.println("a等于c");
        }
        System.out.println("结束");
    }
}
