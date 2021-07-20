package day1.数组;
/*
遍历：获取数组中每一个元素，输出在控制台
获取数组元素：
    格式：数组名.length
    范例： arr.length
遍历通用格式：
    int [] arr = {……};
    for(int x = 0; x<arr.length; x++){
            arr[x] //对arr[x]进行操作
    }


 */
public class Array_Traversing {
    public static void main(String[] args) {

        int[] arr = {11,22,33,44,55};

        for(int x=0; x < arr.length; x++){
            System.out.println(arr[x]);
        }
    }
}
