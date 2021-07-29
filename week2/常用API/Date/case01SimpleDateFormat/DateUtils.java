package week2.常用API.Date.case01SimpleDateFormat;
/*
要求：
定义一个日期工具类（DateUtils),包含两个方法：把日期转换为指定格式的字符串；把字符串解析为指定格式的日期
之后定义一个测试类（DateDemo），测试日期工具类的方法
思路：
1、定义日期工具类
2、定义一个方法dateToString，用于把日期转换为指定格式的字符串
  返回值：String
  参数：Date date，String format
3、定义一个方法stringToDate，用于字符串解析为指定格式的日期
  返回值：Date
  参数：String s，String format
4、定义测试类DateTest，调用日期工具类中的方法

 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
工具类
构造方法私有
成员方法静态
 */
public class DateUtils {
    //构造方法私有
    private DateUtils(){}

    //成员方法静态
    /*
    定义一个方法dateToString，用于把日期转换为指定格式的字符串
    返回值：String
    参数：Date date，String format
     */
    public static String dateToString(Date date,String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(date);
        return s;
    }
   /*
   3、定义一个方法stringToDate，用于字符串解析为指定格式的日期
   返回值：Date
   参数：String s，String format
    */
    public static Date stringToDate(String s,String format)throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(s);
        return d;

    }




}
