package week2.常用API.Date;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
/*
构造方法

public SimpleDateFormat(): 构造一个SimpleDateFormat，使用默认模式和日期格式
public SimpleDateFormat(String pattern)： 构造一个SimpleDateFormat使用给定的模式和日期格式

格式化和解析日期
格式化（从Date到String）
public final String format(Date date):将日期--格式化--日期/时间字符串

解析（从String到Date）
public Date parse(String source): 从给定字符串--解析--日期
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
       //格式化（从Date到String）---要用format()--在SimpleDateFormat类里面--创建对象
        //把日期d通过SimpleDateFormat的sdf对象调用format方法，格式化成字符串
        Date d = new Date();//导包
        //无参数构造
        SimpleDateFormat sdf = new SimpleDateFormat();//导包
        String s = sdf.format(d);
        System.out.println(s);


        //带参数构造
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日HH：mm：ss");
        String s1 = sdf1.format(d);
        System.out.println(s1);
        System.out.println("-----------------");


        /*
        解析（从String到Date）
        public Date parse(String source): 从给定字符串--解析--日期
         */
        String ss = "2021-11-15 10:30:02";
        //ParseException--导包
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd);







    }


}
