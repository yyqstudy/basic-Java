package week2.常用API.Date.case01;

import java.text.ParseException;
import java.util.Date;

/*
测试类
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();
        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtils.dateToString(d, "yyyy-MM-dd");
        System.out.println(s2);

        System.out.println("---------------");

        String s = "2021-11-15 10:15:03";
        Date dd = DateUtils.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);

    }
}
