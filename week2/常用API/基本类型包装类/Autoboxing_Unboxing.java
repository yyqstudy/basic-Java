package week2.常用API.基本类型包装类;
/*
自动装箱autoboxing
装箱
把基本数据类型转换为对应的包装类类型

拆箱unboxing
把包装类类型转换为对应的基本数据类型
 */
public class Autoboxing_Unboxing {
    public static void main(String[] args) {
        //装箱:把基本数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100);
        //自动装箱
        Integer ii =100;//内部隐含Integer.valueOf(100);

        //拆箱：把包装类类型转换为对应的基本数据类型
        //手动拆箱
        //intValue（）方法，把Integer类型转化为Int类型
        ii = ii.intValue() + 200;
        System.out.println(ii);
        //自动拆箱
        ii += 200;//内部隐含ii.intValue() + 200

        Integer iii = null;
        if(iii != null){
            iii += 300;//NullPointerException,要在前一行判断
        }

    }
}
