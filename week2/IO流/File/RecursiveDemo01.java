package week2.IO流.File;
/*
例子：week1中BasicKnowledge_CaseStudy中SumofRabbit---不死兔
斐波那契数列
 */
public class RecursiveDemo01 {
    public static void main(String[] args) {
        //🌟🌟🌟方法一：循环
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

        //调用递归方法
        System.out.println(f(20));

    }

    /*
    递归解决问题：
    首先定义一个方法f(n),表示第n个月第兔子对数
    那么，第n-1个月的兔子对数该如何表示呢？---f(n-1)
    第n-2个月的兔子对数该如何表示呢？---f(n-2)

    StackOverflowError:当堆栈溢出发生时抛出一个应用程序递归太深，这时候需要递归出口限制
     */
    public static int f(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return f(n-1)+f(n-2);
        }
    }
}
