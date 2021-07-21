package day1.方法;
/*
要求：
设计一个方法用于获取数组中元素的最大值，调用方法并输出结果
1、定义一个数组，用静态初始化完成数组元素的初始化
2、定义一个方法，用来获取数组中的最大值
3、调用获取最大值方法，用变量接收返回结果
4、把结果输出到控制台
 */
public class case06_Method_getMax_ParaPass {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素的初始化
        int [] arr = {12,45,98,73,60};
        //调用获取最大值方法，用变量接收返回结果
        int number = getMax(arr);
        //把结果输出到控制台
        System.out.println("number"+number);

    }
    //定义一个方法，用来获取数组中的最大值
    /*
    两个明确
      返回值类型 int  什么时候用return：如果申明的方法需要返回值必须用return，如果是void则不用；由方法定义中的void还是int或是其他决定的
      参数 int[] arr
     */
    public static int getMax(int[] arr){
        int max = arr[0];

        for(int x=1; x<arr.length;x++){
            if(arr[x]>max){
                max = arr[x];
            }
        }
        return max;

    }
}
