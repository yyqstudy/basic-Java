package week2.常用API.Array;

import java.util.Arrays;

/*
public static String toString(int[] arr)
数组的内容，以字符串形式返回

public static void sort(int[] arr)
按照数字顺序排列数组
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {24,69,80,57,13};

        System.out.println("排序前："+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));



    }
}
