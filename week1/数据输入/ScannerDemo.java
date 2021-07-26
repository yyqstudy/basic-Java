package week1.数据输入;
/*数据输入(类似填写姓名，邮箱之类）
Scanner使用步骤
导包： import java.util.Scanner; 该命令必须出现在public class上方
创建对象：Scanner.sc = new Scanner(System.in);这行命令，只有sc是变量名，可变，其他的不允许变
接收数据：int x = sc.nextInt();只有i是变量名，可以变，其他的不变，这里的sc与上方的sc保持一致
*/


import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //接收数据
        int x = sc.nextInt();
        //输出数据
        System.out.println("x:"+x);

    }
}
