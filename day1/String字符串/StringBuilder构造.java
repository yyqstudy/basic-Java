package day1.String字符串;
/*
构造方法
public StringBuilder()--无参--创建一个空白可变字符串对象，不含有任何内容
public StringBuilder(String str)--带参数--根据字符串的内容，来创建可变字符串对象

 */
public class StringBuilder构造 {
    public static void main(String[] args) {
        //public StringBuilder()--无参--创建一个空白可变字符串对象，不含有任何内容
        StringBuilder strb = new StringBuilder();
        System.out.println("strb:"+strb);
        System.out.println("strb.length():"+strb.length());

        //public StringBuilder(String str)--带参数--根据字符串的内容，来创建可变字符串对象
        StringBuilder strb1 = new StringBuilder("dddttt");
        System.out.println("strb1:"+strb1);
        System.out.println("strb1.length():"+strb1.length());

    }
}
