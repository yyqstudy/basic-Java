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
 *      C:在方法中用StringBuilder实现字符串的反转，并把结果转成String
 *      D:调用方法,用一个变量接收结果
 *      E:输出结果
 */
public class case06StringReverse_Upgraded {
    public static void main(String[] args) {
        //键盘录入一个字符串---Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        //
        String s = reverse(line);
        System.out.println("s:"+s);
    }

    //定义一个方法，实现字符串的反转：
    /*两个明确
    返回值类型String（反转后的字符串）
    参数String s（反转前的字符串）
     */
    public static String reverse(String s){
        //在方法中用StringBuilder实现字符串的反转，并把结果转成String
        //String---StringBuilder---reverse()---String
        /*
        StringBuilder strb = new StringBuilder(s);
        strb.reverse();
        String ss = strb.toString();
        return ss;
         */
        //一行代码实现以上功能
        return new StringBuilder(s).reverse().toString();
    }



}
