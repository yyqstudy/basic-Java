package day1;

public class OperatorDemo {
    public static void main(String[] args) {

        System.out.println("逻辑运算符");

        //逻辑运算符 '&'逻辑与   '|'逻辑或  '^' 逻辑异或  '!'逻辑非
        //定义变量
        int x = 10;
        int y = 20;
        int z = 30;
        //& 有false则结果为false
        System.out.println((x > y)&(x > z));//false & false, output is false
        System.out.println((x < y)&(x > z));//true & false, output is false
        System.out.println((x > y)&(x < z));//false & true, output is false
        System.out.println((x < y)&(x < z));//true & true, output is true
        System.out.println("---------");//*****要打双引号

        // | 有true则true
        System.out.println((x > y)|(x > z));//false | false
        System.out.println((x < y)|(x > z));//true | false
        System.out.println((x > y)|(x < z));//false | true
        System.out.println((x < y)|(x < z));//true | true
        System.out.println("---------");//*****要打双引号

        // ^ 两者相同结果为false，不同为true
        System.out.println((x > y)^(x > z));//false ^ false
        System.out.println((x < y)^(x > z));//true ^ false
        System.out.println((x > y)^(x < z));//false ^ true
        System.out.println((x < y)^(x < z));//true ^ true
        System.out.println("---------");//*****要打双引号

        // ! 取反
        System.out.println((x > y)); //false
        System.out.println(!(x > y));//!false,结果为true
        System.out.println(!!(x > y));//!!false
        System.out.println(!!!(x > y));//!!!false

        System.out.println("---------");//*****要打双引号
        System.out.println("短路运算符");


        //短路运算符 短路与'&&', 短路或'||'
        //&&:有false则结果为false
        System.out.println((x > y)&&(x > z));//false && false, output is false
        System.out.println((x < y)&&(x > z));//true &&false, output is false
        System.out.println((x > y)&&(x < z));//false && true, output is false
        System.out.println((x < y)&&(x < z));//true && true, output is true
        System.out.println("---------");//*****要打双引号

        //&&与&的区别
        System.out.println((x++ > 100)&& (y++ > 100));//左边为false，右边不执行；左边为true，右边继续
        System.out.println("&&时候的x:"+ x);
        System.out.println("&&时候的y:"+ y);
        System.out.println((x++ > 100)& (y++ > 100));
        System.out.println("&时候的x:"+ x);
        System.out.println("&时候的y:"+ y);
        System.out.println("---------");//*****要打双引号


        // || 有true则true,但是与|的区别同上：短路或||，左边为true，右边不执行
        System.out.println((x > y)||(x > z));//false | false
        System.out.println((x < y)||(x > z));//true | false
        System.out.println((x > y)||(x < z));//false | true
        System.out.println((x < y)||(x < z));//true | true


        System.out.println("---------");//*****要打双引号
        System.out.println("三元运算符");
        /*三元运算符： 格式：关系表达式？表达式1：表达式2
        范例： a>b ? a:b
        首先计算关系表达式的值
        如果值为true，运算结果就是表达式1；
        如果值为false，运算结果就是表达式2；

         */
        //定义变量
        int a = 10;
        int b = 20;
        //获取两个数据的较大值
        int max = a > b ? a : b;
        //输出结果
        System.out.println("max"+max);



    }
}
