package week2.常用API.基本类型包装类;

public class IntegerDemo {
    public static void main(String[] args) {
        //要求：判断一个数据是否在int范围--确认int的范围
        //public static final int MAX_VALUE
        //public static final int MIN_VALUE
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("--------------");

        //public static Integer valueOf(int i) 返回---指定int值的integer
        Integer i1 = Integer.valueOf(11);
        System.out.println(i1);

        //public static Integer valueOf(String s)
        //返回一个保存指定值Integer对象string（字符串必须由数字组成，否则报错）--string转成Integer类型
        Integer i2 = Integer.valueOf("33");
        System.out.println(i2);
        System.out.println("--------------");

        /*
        int 与 string相互转换
         */
        //******int转换成string********
        //定义一个int
        int number = 100;
        //方法一：用 + 拼接
        String s1 = " " + number;
        System.out.println(s1);
        //方法二
        //public static String valueOf(int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("--------------");


        //******string转换成int********
        //定义一个string
        String s = "100";
        //方法一： String---Integer---int
        Integer i = Integer.valueOf(s);//String---Integer
        //public int intValue()---Integer返回int
        int x = i.intValue();
        System.out.println(x);

        //方法二：String---int
        //public static int parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println(y);
    }
}
