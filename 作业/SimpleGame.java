package 作业;
/*
出现的问题思考
在定义方法里面，不需要scanner录入数据--录入数据全部在main()实现

 */

/*在键盘输入1或者2
输入1，则是跳到converting time
输入2，则是跳到calculating the sum of digits in an integer
个人分析：要用if……else分支，之后调用method

converting time
输入多少秒，然后自动计算转成格式hours:minutes:seconds, and print the result
个人分析：要用到dateformat

calculating the sum of digits in an integer
输入数字，个位十位……相加的和  321 变成3+2+1=6
个人分析：先判断该数字是几位数，取出个位十位……(❌）
       直接转成string--用split分隔--转int类型--相加
 */

import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 or 2:");
        int number = sc.nextInt();

        //根据选项调用不同的方法
        //If the user enters 1, ask for an integer to convert and call the convertTime method.
        if (number == 1) {
            //接收数据
            System.out.println("Please enter seconds:") ;
            int seconds = sc.nextInt();
            //convertTime(seconds);
            //方法调用
            System.out.println(convertTime(seconds));
        } else if (number == 2) {
            System.out.println("Please enter integers:" );
            int integers = sc.nextInt();

            // digitsSum(integers);
            System.out.println("sum:"+digitsSum(integers));
        } else {
            System.out.println("Please enter the right numbers as required");
        }


    }

    //converting time  HH:mm:ss
    //public String(int)根据int数组的内容来创建字符串对象
    /*public static Object convertTime(Object seconds) {

    }*/
    public static String convertTime(int seconds) {
        int hour = 0;
        int minute = 0;
        int second = 0;

        //minute = seconds/60;
        // hour = minute/60;


        /*if(seconds<=0)
            return "00:00:00";
        else if (hour == 0 && minute < 60){
            second = seconds % 60;
            System.out.println("00:"+minute+second);

            }
        else(hour > 0){
            hour = seconds / 3600;
            int pre = seconds % 3600;
            minute = pre / 60;
            second = pre % 60;
            System.out.println(hour +":"+minute+":"+second);
        }*/
        hour = seconds / 3600;
        int pre = seconds % 3600;
        minute = pre / 60;
        second = pre % 60;
        return pre1(String.valueOf(hour))
                .concat(":")
                .concat(pre1(String.valueOf(minute)))
                .concat(":")
                .concat(pre1(String.valueOf(second)));
    }
    private static String pre1(String a) {
        return a.length() == 1? "0".concat(a): a;
    }


    //digitsSum 取出个位十位百位
    public static String digitsSum(int integers) {
        int sum = 0;
        // 直接转成string--用split分隔--
        String s =  String.valueOf( integers);
        String [] ss = s.split("|");
        for(int i =0;i<ss.length;i++){
            sum += Integer.parseInt(ss[i]);
        }
        //转int类型--相加
        /*//数组转换 ss  ii
        int [] ints = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            ints[i] = Integer.parseInt(ss[i]);
        }*/
        //System.out.println("sum:"+sum);
        //返回值要对应定义方法的string
        String sum1 =  String.valueOf(sum);
        return sum1;
    }

}
