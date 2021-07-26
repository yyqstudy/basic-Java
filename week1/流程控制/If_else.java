package week1.流程控制;

/*
if else 语句格式
注意括号形式

 格式：
    if （关系表达式）{
        语句体1；
    } else{
        语句体2;
    }
    执行流程：
    1.首先计算关系表达式（即括号内）的值
    2.如果关系表达式的值为true，执行语句体1；如果为false，执行语句体2
    3.继续执行语句体下方的语句内容
 */
public class If_else {
    public static void main(String[] args) {
        //定义两个变量
        int a = 10;
        int b = 20;
        //要求：判断a是否大于b：如果是，输出：a的值大于b；如果不是，输出：a的值不大于b
        if (a > b) {
            System.out.println("a的值大于b");
        }else {
            System.out.println("a的值不大于b");
        }
        System.out.println("结束");
    }
}
