package day1.数组;

/*
索引越界：访问了数组中不存在的索引对应的元素，造成索引越界问题
       ArrayIndexOutOfBoundsException
空指针异常：访问数组已经不再指向堆内存的数据，造成空指针异常
       NullPointerException
null：空值，引用数据类型的默认值，表示不指向任何有效对象
 */

public class Array_Problem {
    public static void main(String[] args) {
        int[] arr = new int[3];

        //索引越界
        //System.out.println(arr[3]);

        //空指针异常,把null赋值给数组
        arr = null;
        System.out.println(arr[0]);

    }
}
