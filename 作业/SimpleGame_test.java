package 作业;


//出现的问题思考--在定义方法里面，不需要scanner录入数据--录入数据全部在main()实现

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

public class SimpleGame_test {


    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter 1 or 2:");
            int number = sc.nextInt();

            //根据选项调用不同的方法
            //If the user enters 1, ask for an integer to convert and call the convertTime method.
            if (number == 1) {
                //接收数据
                System.out.println("Please enter seconds:");
                int seconds = sc.nextInt();
                //convertTime(seconds);
                //方法调用
                System.out.println(convertTime(seconds));
                //break;
            } else if (number == 2) {
                System.out.println("Please enter integers:");
                int integers = sc.nextInt();
                // digitsSum(integers);
                System.out.println("sum:" + digitsSum(integers));
                break;
            } else {
                System.out.println("Please enter the right numbers as required");
            }
        }

    }

    //converting time  HH:mm:ss
    public static String convertTime(int seconds) {
        //定义三个变量
        int hour = 0;
        int minute = 0;
        int second = 0;
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
        return a.length() == 1 ? "0".concat(a) : a;
    }

    //digitsSum 取出个位十位百位
    public static String digitsSum(int integers) {
        int sum = 0;
        // 直接转成string--用split分隔--
        String s = String.valueOf(integers);
        String[] ss = s.split("|");
        for (int i = 0; i < ss.length; i++) {
            sum += Integer.parseInt(ss[i]);
        }
        //返回值要对应定义方法的string
        String sum1 = String.valueOf(sum);
        return sum1;
    }
}
