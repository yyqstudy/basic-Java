package day1.String字符串;
/*
添加和反转
public StringBuilder append(任意类型):添加数据，并返回自身对象
public StringBuilder reverse()：返回相反的字符序列
 */
public class StringBuilder添加和反转 {
    public static void main(String[] args) {
    //create object
    StringBuilder strb = new StringBuilder();

    //public StringBuilder append(任意类型):添加数据，并返回自身对象
    /*
    StringBuilder strb2 = strb.append("hello");
    System.out.println("strb:"+strb);
    System.out.println("strb2:"+strb2);
    System.out.println(strb == strb2);
    */

    /*
     strb.append("hello");
     strb.append("java");
     strb.append(" ");
     strb.append("hello");
     strb.append("python3.0");
     */

    //链式编程
    strb.append("hello").append("world").append(" ").append("java");
     System.out.println("strb:"+strb);


     //public StringBuilder reverse()：返回相反的字符序列
     strb.reverse();
     System.out.println("strb:"+strb);

    }
}
