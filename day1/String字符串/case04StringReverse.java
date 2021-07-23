package day1.String字符串;

import java.util.Scanner;

/*
 * 字符串反转
 *要求：定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
 * 举例：键盘录入”abc”
 * 输出结果：”cba”
 *
 * 分析：
 * 		A:键盘录入一个字符串---Scanner
 * 		B:定义一个方法，实现字符串的反转：返回值类型String（反转后的字符串）、参数String s（反转前的字符串）
 * 		C:方法一：把字符串倒着遍历，得到的每一个字符拼接成字符串并返回
 * 		  方法二:把字符串转换为字符数组，然后对字符数组进行反转，最后在把字符数组转换为字符串--参考 内容反转顺序.java
 * 		D:调用方法,用一个变量接收结果
 * 		E:输出结果
 *

 */
public class case04StringReverse {
    public static void main(String[] args) {
        //键盘录入一个字符串---Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //调用方法,用一个变量接收结果
        String s = reverse(line);
        //输出结果
        System.out.println("s:"+s);
    }
    //定义一个方法，实现字符串的反转
    /*
    两个明确
      返回值类型： String
      参数： String s
     */
    public static String reverse(String s){
        //把字符串倒着遍历，得到的每一个字符拼接成字符串并返回
        //先定义一个空的字符串，返回它
        String ss = "";

        for(int i = s.length()-1;i>=0;i--){
            ss +=s.charAt(i);
        }

        return ss;

    }
}
