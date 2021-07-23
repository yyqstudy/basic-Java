package day1.String字符串;
/*
1、通过new创建的字符串对象，每一次new都会申请一个内存空间，虽然内容相同，但是地址值不同
 char[] chs = {'a','b','c'};
 String s1 = new String(chs);
 String s2 = new String(chs);
 JVM会首先创建一个字符数组，然后每一次new的时候都会有一个新的地址，只不过s1和s2参考的字符串内容相同

2、以""方式给出的字符串，只要字符序列相同（顺序和大小写）,无论程序代码出现几次，JVM都只会建立一个String
对象，并在字符串池中维护
 String s3 = "abc";
 String s4 = "abc";
 在上面的代码中，针对第一行代码，JVM会建立一个String对象放在字符串池中，并给s3参考；
 第二行则是让s4直接参考字符串池中的String对象，也就是说它们的本质是同一个对象，内存地址一样（因为String对象放在字符串池中，然后直接赋值给s3和s4

 */
public class String对象 {
    public static void main(String[] args) {
        //构造方法的方式得到对象
        char[] chs = {'a','b','c'};
        String s1 = new String(chs);
        String s2 = new String(chs);
        System.out.println(s1 == s2);
        //直接赋值的方式得到对象
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4);
        //比较字符串对象地址是否相同
        System.out.println(s1 == s3);
    }
}
