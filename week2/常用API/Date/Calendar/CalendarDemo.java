package week2.常用API.Date.Calendar;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象--当前时间
        Calendar c = Calendar.getInstance();//多态的形式得到对象--Calendar是抽象类--考虑其子类GregorianCalendar
        System.out.println(c);
        System.out.println("--------------------");
        //获取年、月、日
        //public int get(int field)
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;//月份从0开始算，所以为了符合我们的日历，加1
        int date = c.get(Calendar.DATE);//获取日

        System.out.println(year+"年"+month+"月"+date+"日");
        System.out.println("--------------------");

        /*
        常用方法
        public abstract void add(int field, int amount) 根据日历，将指定的时间量添加或减去给定的日历
        public final void set(int year,int month,int date) 设置当前的日历的年月日
         */
       //public abstract void add(int field, int amount)
        c.add(Calendar.YEAR, -3);//添加或减去给定的日历
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH)+1;//月份从0开始算，所以为了符合我们的日历，加1
        int date1 = c.get(Calendar.DATE);//获取日

        System.out.println(year1+"年"+month1+"月"+date1+"日");
        System.out.println("--------------------");

        //要求：10年后的10天前
        c.add(Calendar.YEAR,10);
        c.add(Calendar.DATE,-10);
        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH)+1;//月份从0开始算，所以为了符合我们的日历，加1
        int date2 = c.get(Calendar.DATE);//获取日

        System.out.println(year2+"年"+month2+"月"+date2+"日");
        System.out.println("--------------------");


        //public final void set(int year,int month,int date) 设置当前的日历的年月日
        c.set(2022,8,02);
        int year3 = c.get(Calendar.YEAR);
        int month3 = c.get(Calendar.MONTH);//月份从0开始算，所以为了符合我们的日历，加1
        int date3 = c.get(Calendar.DATE);//获取日

        System.out.println(year3+"年"+month3+"月"+date3+"日");
        System.out.println("--------------------");
    }
}
