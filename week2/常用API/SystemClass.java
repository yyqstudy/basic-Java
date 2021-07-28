package week2.常用API;
/*
System:包含一些有用的类字段和方法。它不能被实例化（创建对象）
      static修饰，直接通过名来访问
常用方法：
public static void exit(int status)   终止当前运行的Java虚拟机，非零表示异常终止
public static long currentTimeMillis()       返回当前时间（以毫秒为单位）

 */
public class SystemClass {
    public static void main(String[] args) {
       // System.out.println("开始");
        //public static void exit(int status)   终止当前运行的Java虚拟机，非零表示异常终止
        //System.exit(0);
        //System.out.println("结束");

        //public static long currentTimeMillis()       返回当前时间（以毫秒为单位）
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365+"年");//隔了多少年，变成浮点数更准确


        //求出for循环耗费时间
        long start = System.currentTimeMillis();
        for(int i =0; i<10000; i++){
            //System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start)+"毫秒");
    }
}
