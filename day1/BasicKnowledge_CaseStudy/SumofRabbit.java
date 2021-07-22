package day1.BasicKnowledge_CaseStudy;
//等同于斐波那契数列，通过循环来解决
/*
需求：
有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
假如兔子都不死，问第二十个月的兔子对数为多少？

 month   1,2,3,4,5,6,7,8
 兔子对数  1,1,2,3,5,7
规律：
 * 		第一个月：1
 * 		第二个月：1
 * 		第三个月：2
 * 		第四个月：3
 * 		第五个月：5
 * 		...

规律：从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和。
第一个月和第二个月的兔子对数是1

分析：
int[] arr = new int[20];
arr[0] =1;
arr[1] =1;
arr[2] =2= arr[0]+arr[1];
arr[3] =5= arr[1]+arr[2];

arr[n]=arr[n-1]+arr[n-2];
思路：
1、为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20；
2、因为第一个月，第2个月兔子的对数是已知的，都是1，所以数组的第1个元素，第2个元素也都是1
3、用循环实现计算每个月的兔子对数
for(int x =?; x<?;x++){
  规律
  }
4、输出数组中最后一个元素的值，就是第20个月兔子的对数
 */
public class SumofRabbit {
    public static void main(String[] args) {
        //为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20；
        int[] arr = new int[20];
        //因为第一个月，第2个月兔子的对数是已知的，都是1，所以数组的第1个元素，第2个元素也都是1
        arr[0] =1;
        arr[1] =1;
        //用循环实现计算每个月的兔子对数
        for(int x =2; x< arr.length;x++){
            arr[x] = arr[x-2] +arr[x-1];//规律
            //检验：arr[4] = arr[2] +arr[3]
        }
        //输出数组中最后一个元素的值，就是第20个月兔子的对数
        System.out.println("第二十个兔子的对数是"+arr[19]);
    }
}