package week1.BasicKnowledge_CaseStudy;

import java.util.Scanner;

/*2个问题
1、while死循环这里，这个文件输入数据+输出索引就是一个死循环，只要不断录入数据，就一直……
2、不存在的数据，返回-1，这里为什么不使用else--return -1
 */

/*
已知一个数组arr = {19,28,37,46,50};键盘录入一个数据，查找该数据在数组中索引，并在
console输出结果
分析：
键盘录入一个数据后，让这个数据和数组中每一个元素进行比较，如果数值相等，返回该数值对应的索引值
但是
录入一个数组不存在的数据，无内容输出
在实践中，对应索引不存在，返回一个负数，经常用-1

思路：
1、定义一个数组--静态初始化
2、键盘录入要查找的数据，用一个变量接收
3、定义一个索引变量，初始值为-1
4、遍历数组，获取数组中数据每一个元素
5、拿键盘录入数据和数组中的每一个元素进行比较，如果值相同，就把该值对应的索引赋予给索引变量，并结束循环break
6、输出索引变量
 */
public class get_Index {
    public static void main(String[] args) {
        //定义一个数组--静态初始化
        int[] arr = {19,28,37,46,50};
        while(true){
            //用死循环实现持续录入查找
            //键盘录入要查找的数据，用一个变量接收
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数据：");
            int number = sc.nextInt();

        /*why--因为查找数据比较多，直接定义一个方法
        //定义一个索引变量，初始值为-1
        int index = -1;
        //遍历数组，获取数组中数据每一个元素
        for(int x =0; x< arr.length;x++){
            if(arr[x]== number){
                index = x;
                break;
            }
        }

         */
            //调用方法
            int index = getIndex(arr, number);
            //输出索引变量
            System.out.println("index:"+index);

        }
    }


    //查找指定的数据在数组中的索引
    /*
    两个明确：
    返回值类型（返回的是索引）：int
    参数：int[] arr, int number
     */
    public static int getIndex(int[] arr, int number) {
        //定义一个索引变量，初始值为-1
        int index = -1;
        //遍历数组，获取数组中数据每一个元素
        for(int x =0; x< arr.length;x++){
            if(arr[x]== number){
                index = x;
                break;
            }
        }
        //返回索引
        return index;
    }
}
