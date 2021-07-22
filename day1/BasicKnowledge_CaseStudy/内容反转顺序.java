package day1.BasicKnowledge_CaseStudy;
/*
出现了两个方法
已知一个数组arr = {19,28,37,46,50};用程序实现把数组中的元素值交换
交换后的数组arr = {50,46,37,28,19}；并在console输出交换后的数组
元素交换
假设数组
开始索引--start
结束索引--end
临时空间--temp
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;

思路：
1、定义一个数组，静态初始化
2、循环遍历数组，定义2个索引变量，判断条件是start小于等于end
3、变量交换
4、遍历数组,定义一个方法--两个明确--返回值类型：void（遍历所以无返回值）
                              参数：int[] arr

 */

//这里使用两个方法定义
public class 内容反转顺序 {
    public static void main(String[] args) {
        //定义一个数组，静态初始化
        int[] arr = {19, 28, 37, 46, 50};
        /*
        //循环遍历数组，定义2个索引变量，判断条件是start小于等于end
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            //变量交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        */
        ////方法调用reverse
        reverse(arr);
        //方法调用调用遍历数组
        printArray(arr);

    }

    /*方法定义--reverse
    返回值类型：void（数组是引用类型，形参的改变直接影响实参）
    参数：int[] arr
     */
    //循环遍历数组，定义2个索引变量，判断条件是start小于等于end
    public static void reverse(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            //变量交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

    }

    /*遍历数组方法，参考方法中case05
    返回值类型：void（遍历所以无返回值）
    参数：int[] arr
    */
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
}