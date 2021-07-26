package week1.String字符串;
/*
构造方法
public String() 创建一个空白的字符串，不含有任何内容
public String(char[] chs) 根据字符数组的内容，来创建字符串的对象
public String(byte[] bys) 根据字节数组的内容，来创建字符串的对象
直接赋值
String s = "abc"; 直接赋值来创建字符串，内容就是abc

推荐使用--直接赋值
 */
public class StringDemo {
    public static void main(String[] args) {
        //public String() 创建一个空白的字符串，不含有任何内容
        String s1 = new String();
        System.out.println("s1:"+s1);

        //public String(char[] chs) 根据字符数组的内容，来创建字符串的对象
        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2:"+s2);

        //public String(byte[] bys) 根据字节数组的内容，来创建字符串的对象
        byte[] bys = {97,98,99};//输出与char[]chs一样，因为字符串效果上相当于字符数组char[]
        String s3 = new String(bys);
        System.out.println("s3:"+s3);

        //String s = "abc"; 直接赋值来创建字符串，内容就是abc
         String s4 = "abc";
        System.out.println("s4:"+s4);
    }
}
