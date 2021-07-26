package week1.String字符串;
/*
StringBuilder和String的相互转换

StringBuilder转换为String
public String toString():通过toString()就可以实现把StringBuilder转成String
String转换为 StringBuilder
public StringBuilder(String str):通过构造方法就可以实现把String转成StringBuilder
 */
public class StringBuilder_String互转 {
    public static void main(String[] args) {
        //StringBuilder转换为String
       /*
        StringBuilder strb = new StringBuilder(); //创建对象
        strb.append("hello");
        //String s = strb;//错误的做法
        String s = strb.toString();//通过toString()就可以实现把StringBuilder转成String
        System.out.println("s:"+s);
        */

        //String转换为 StringBuilder
        String s = "wprl";
        StringBuilder strb = new StringBuilder(s);
        System.out.println(strb);


    }
}
