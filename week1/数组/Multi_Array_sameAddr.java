package week1.数组;
//多个数组指向相同
//当两个数组指向相同时，任何一个数组修改了堆内存的数据（new int[]），另外一个数组去访问时，它的元素值也会发生改变
public class Multi_Array_sameAddr {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //定义第二个数组指向第一个数组
        int[] arr2 = arr;//此时arr2与arr的内存地址相同了
        arr2[0] = 111;
        arr2[1] = 222;
        arr2[2] = 333;
        //输出两个数组的名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr2);
        System.out.println(arr2[0]);

    }
}
