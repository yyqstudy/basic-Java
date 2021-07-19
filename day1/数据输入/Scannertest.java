package day1.数据输入;

/*case study：三个和尚，他们身高必须经过测量，请用程序获取这三人最高身高（结合ScannerDemo.java和game.java)
身高未知，采用键盘输入，首先导包，然后创建对象
键盘录入三个身高分别赋值给三个变量
用三元运算符将先比较前两个和尚的身高，用临时身高变量保存起来
用三元运算符将临时身高与第三个和尚比较，并用最大身高变量保存
输出结果
 */
import java.util.Scanner;

public class Scannertest {
    public static void main(String[] args) {
        //首先导包，然后创建对象
        Scanner sc = new Scanner(System.in);
        //键盘录入三个身高分别赋值给三个变量
        System.out.println("请输入第一个和尚的身高:");
        int height1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高:");
        int height2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高:");
        int height3 = sc.nextInt();
        //用三元运算符将先比较前两个和尚的身高，用临时身高变量保存起来
        int tempheight = height1 > height2 ? height1 : height2;
        //用三元运算符将临时身高与第三个和尚比较，并用最大身高变量保存
        int maxheight = tempheight > height3 ? tempheight : height3;
        //output
        System.out.println("这三个和尚中身高最高的是" +maxheight+"cm");

    }
}
