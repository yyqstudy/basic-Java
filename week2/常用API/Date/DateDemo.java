package week2.常用API.Date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //public Date() ：创建的是一个表示当前系统时间的Date对象
        Date d = new Date();
        System.out.println(d);//输出到是当前电脑时间，说明类已经重写toString

        //public Date(long date) ：表示为从1970年1月1日00:00:00起到指定时间到毫秒数
       long date = 1000*60*60;//1000毫秒=1秒
        Date dd =new Date(date);
        System.out.println(dd);//有时差
        System.out.println("--------------------");

        /*
        常用方法：
        public long getTime()  获取的是日期对象从1970年1月1日00：00：00到现在到毫秒值
        public void setTime(long time)  设置时间，给的是毫秒值
         */
        //创建日期对象
        Date ddd = new Date();
        //public long getTime()  获取的是日期对象从1970年1月1日00：00：00到现在到毫秒值
        System.out.println(ddd.getTime());
        System.out.println(ddd.getTime()*1.0/1000/60/60/24/365+"year");

        //public void setTime(long time)  设置时间，给的是毫秒值
        //long time = 1000*60*60;
        long time = System.currentTimeMillis();//返回当前电脑时间
        Date d4 =new Date(date);
        d4.setTime(time);
        System.out.println(d4);

    }
}
