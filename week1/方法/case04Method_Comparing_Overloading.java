package week1.方法;

/*
case：使用方法重载的思想，设计比较两个整数是否相同的方法(boolean)，兼容全整数（byte,short,int,long)
思路分析：
1、定义比较两个数字是否相同的方法compare()方法，参数选择两个int类型
   public static boolean compare(int a , int b){
      return a==b;
   }
2、定义对应的重载方法，变更对应的参数类型，参数变更为两个long型参数
  public static boolean compare(long a , long b){
      return a==b;
   }

3、定义所有的重载方法，两个byte类型与两个short类型参数
  public static boolean compare(byte a , byte b){
      return a==b;
   }
   public static boolean compare(short a , short b){
      return a==b;
   }

4、完成方法调用，测试运行结果
  public static void main(String[] args) {
    System.out.println(compare(10,20));
  }

 */

public class case04Method_Comparing_Overloading {
    public static void main(String[] args) {
        //方法调用
        System.out.println(compare(10,20));
        System.out.println(compare((byte)10,(byte)20));
        System.out.println(compare((short)10,(short)20));
        System.out.println(compare(10L,20L));

    }
    public static boolean compare(int a , int b){
        System.out.println("int");//为什么这个不能放在return下方，这个语句的作用是为了分清楚方法调用哪一个
        return a==b;
    }
    public static boolean compare(long a , long b){
        System.out.println("long");
        return a==b;

    }
    public static boolean compare(byte a , byte b){
        System.out.println("byte");
        return a==b;

    }
    public static boolean compare(short a , short b){
        System.out.println("short");
        return a==b;

    }


}
