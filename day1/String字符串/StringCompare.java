package day1.String字符串;
/*
使用==作比较
基本类型：比较数据值是否相同
引用类型：比较地址值是否相同

字符串是对象，它比较内容是否相同，是通过一个方法来实现：equals()
public boolean equals(Object anObject):将此字符串与指定对象进行比较，由于我们比较的是字符串对象，所以参数直接传递一个字符串

String类的判断功能：
 * boolean equals(Object obj):比较字符串的内容是否相同
 * boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
 * boolean startsWith(String str):判断字符串对象是否以指定的str开头
 * boolean endsWith(String str):判断字符串对象是否以指定的str结尾

 */
public class StringCompare {
    public static void main(String[] args) {
        //构造方法的方式得到对象
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        //直接赋值的方式得到对象
        String s3 = "abc";
        String s4 = "abc";

        //比较字符串对象地址是否相同
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println("-------");

        //比较字符串内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));

    }
}
