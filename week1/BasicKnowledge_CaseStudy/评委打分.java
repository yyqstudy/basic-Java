package week1.BasicKnowledge_CaseStudy;

import java.util.Scanner;

/*
需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
选手的最后得分为：去掉一个最高分和一个最低分后 其余4个选手的平均值。
思路：
1、定义一个数组，用动态初始化完成数组元素的初始化，长度为6
2、键盘录入评委分数
3、由于是6个评委打分，所以接收评委分数的操作，用循环改进
4、定义方法实现获取数组中的最高分（最大值），调用方法
5、定义方法实现获取数组中的最低分（最小值），调用方法
6、定义方法实现获取数组中的所有元素的和（数组元素求和），调用方法
7、按照计算规则进行计算得到平均分
8、输出avg

 */
public class 评委打分 {
    public static void main(String[] args) {
        //定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        int [] arr = new int[6];
        //键盘录入评委分数
        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("请输入第一个评委的打分");
        arr[0] = sc.nextInt();
        System.out.println("请输入第二个评委的打分");
        arr[1] = sc.nextInt();
        System.out.println("请输入第三个评委的打分");
        arr[2] = sc.nextInt();
        */
        //用循环改进,由于是6个评委打分，所以接收评委分数的操作
        for(int x = 0;x<arr.length;x++){
            System.out.println("请输入第"+(x+1)+"个评委的打分：");
            arr[x]=sc.nextInt();
        }

        //调用方法
        //printArray(arr);
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);
        //按照计算规则进行计算得到平均分
        int avg = (sum - max-min)/(arr.length - 2);
        //输出avg
        System.out.println("选手的最终得分是："+avg);

    }

    /*定义方法实现获取数组中的最高分（最大值），调用方法
    两个明确
    返回值类型：int
    参数：int[] arr
    */

    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int x =1; x<arr.length;x++){
            if(arr[x]>max){
                max = arr[x];
            }
        }
        return max;
    }
    /*定义方法实现获取数组中的最低分（最小值）
    两个明确
    返回值类型：int
    参数：int[] arr
    */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for(int x =1; x<arr.length;x++){
            if(arr[x]<min){
                min = arr[x];
            }
        }
        return min;
    }


    /*
    定义方法实现获取数组中的所有元素的和（数组元素求和）
    两个明确
    返回值类型：int
    参数：int[] arr
     */
    public static int getSum(int[] arr) {
        int sum = 0;
        for(int x =1; x<arr.length;x++){
                sum += arr[x];
        }
        return sum;
    }
   //遍历数组
    /*
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            //由于要求中数字需要"，"隔开，最后一个数字不需要，所以使用分支语句if…else
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }
        }
        System.out.println("]");
    }

     */
}
