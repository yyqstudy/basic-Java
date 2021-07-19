package day1.流程控制;
/*
水仙花数
1、是三位数
2、水仙花数的个位、十位、百位的数字立方和等于原数

要求：在控制台输出所有的"水仙花数"
例子：371
分析：
1、三位数的个位怎么求
  原始数字对10进行取余运算对结果
  371 % 10 = 1
2、三位数的百位怎么求
  原始数字除以100的结果（整除）
  371 / 100 = 3
3、三位数的十位怎么求
  371通过除以10，可以将7移动到个位上（整数）
  371 / 10 = 37
  37通过对10进行取余运算可以得到最后一位的值 7
  37 % 10 =7
4、思考：任意数字的指定位上的数值如何求
  先使用整除操作将要求的数字移动到个位上，再使用取余操作取出最后一位的值
  比如 123456789 先整除10000得到12345，再对10取余得到5

本题要求：在控制台上输出所有的水仙花数
分析：
1、输出水仙花数要使用到循环，遍历所有的三位数，三位数是100～999
   for(int i = 100; i<=999; i+=){……}
2、不是每个的三位数都是水仙花数，因此需要判定，满足条件的数字才能输出
   if(执行的限制条件）{……}
3、判定条件是将三位数中每个数值取出来，计算立方和，接着与原始数字比较是否相等
   if( ? + ? + ? == 原数){ 输出原数 }
4、在计算之前获取三位数中每个位上的值
   int a = 原数的个位；
   int b = 原数的十位；
   int b = 原数的百位；
   if( a*a*a + b*b*b + c*c*c == 原数）{ 输出原数 }

综合分析
1、先建立循环
2、取出三位数中的个位十位百位
3、计算是否满足条件，满足条件输出


 */


public class case05Narcissistic_number {
    public static void main(String[] args) {
        //输出水仙花数要使用到循环，遍历所有的三位数，三位数是100～999
        for(int i=100; i<1000; i++){
            //在计算之前获取三位数中每个位上的值
            int h = i % 10;
            int t = i/10%10;
            int d = i/10/10%10;

            //判定条件是将三位数中每个数值取出来，计算立方和，与原数比较是否相等
            if( h*h*h + t*t*t + d*d*d == i){
                //输出满足条件的数字就是水仙花数
                System.out.println(i);

            }

        }

    }
}

//出现问题，经常忘了在写完代码后面加上花括号