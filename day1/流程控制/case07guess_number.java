package day1.流程控制;

/*
case:猜数字
要求：程序自动生成一个1～100之间的数字，使用程序实现猜出这个数字是多少
分析：
1、完成这个游戏，首先要有一个要猜的数字，使用随机数生成该数字。范围1到100

   Random r = new Random();
   int number = r.nextInt(100)+1;

2、无法预知多少次猜成功，所以猜数字操作是反复进行---使用循环，while循环常用于描述未知循环次数的循环
  反复操作的是不断输入数据，而不是不断产生随机数

   while(条件){}

3、使用程序实现猜数字，每次都要输入猜数字的值---使用键盘录入Scanner

   Scanner sc = new Scanner(System.in);
   int guessNumber = sc.nextInt();

4、比较输入的数字和系统产生的数据，需要使用分支语句---这里使用if……else if……else，根据不同情况进行猜测结果显示
   猜中之后使用break结束循环

   if(条件：比要猜的数字大){
   }else if(条件：比要猜的数字小){
   }else{ break；}

 */
import java.util.Random;
import java.util.Scanner;

public class case07guess_number {
    public static void main(String[] args) {
        //完成这个游戏，首先要有一个要猜的数字，使用随机数生成该数字。范围1到100
        //****自己思考：while不能将Random套进去，不然会每次都产生随机数；同理，while循环要将Scanner套进去，因为要输入数字多次
        Random r = new Random();
        int number = r.nextInt(100)+1;

        //while循环
         /*死循环
         while(true){
             System.out.println("xxx");
         }*/

        while(true){
            //使用程序实现猜数字，每次都要输入猜数字的值---使用键盘录入Scanner
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();
            //比较输入的数字和系统产生的数据，需要使用分支语句---这里使用if……else if……else，根据不同情况进行猜测结果显示
            if(guessNumber > number){
                System.out.println("你猜的数字"+guessNumber+"大了");
                //break;
            }else if(guessNumber < number){
                System.out.println("你猜的数字"+guessNumber+"小了");
               // break;
            }else{
                System.out.println("恭喜你猜中了");
                //猜中之后使用break结束循环
                break;
            }

        }
    }
}
