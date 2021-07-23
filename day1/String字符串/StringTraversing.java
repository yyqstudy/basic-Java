package day1.String字符串;

import java.util.Scanner;

/*
遍历字符串，与遍历数组一样，参考Array_Traversing
要求：键盘录入一个字符串，使用程序实现console输出
思路：
1、键盘录入一个字符串，用Scanner实现
2、遍历字符串，首先获取字符串中每一个字符
  public char charAt(int index):返回指定索引处的char值，字符串的索引也是从0开始
3、遍历字符串，其次获取字符串的长度
  public int length():返回此字符串的长度
  数组的长度：数组名.length
  字符串的长度：字符串对象.length()
4、遍历字符串的通用格式
 for(int i = 0; i<s.length();i++){
    s.charAt(i);//就是指定索引处的字符值
    }
 */
public class StringTraversing {
    public static void main(String[] args) {
        //键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();//快捷键commend+option+V

        //遍历字符串，首先获取字符串中每一个字符
//        System.out.println(line.charAt(0));
//        System.out.println(line.charAt(1));
//        System.out.println(line.charAt(2));
        for(int i = 0; i<line.length();i++){
            System.out.println(line.charAt(i));//就是指定索引处的字符值
        }
    }
}
