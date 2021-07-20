package 数组;

/*
数组array是一种用于存储多个、相同类型数据的存储模型
格式：
   数据类型[] 变量名;
     int[] arr;

数组初始化：
1、所谓初始化，就是为了数组中的数组元素分配内存空间，并为每个数组元素赋值
2、数组初始化：
   动态初始化
         初始化时只指定数组长度，由系统为数组分配初始值
         格式：数据类型[]变量名 = new 数据类型[数组长度];
         范例：int[] arr = new int[3];

   静态初始化



 */

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        /*
        左边：
          int：说明数组中的元素类型是int类型
          []:说明这是一个数组
          arr：这是数组名称
        右边：
          new：为数组申请内存空间
          int：说明数组中的元素类型是int类型
          []:说明这是一个数组
          3：数组长度，其实就是数组中的元素个数
         */
        //输出数组名 数组变量访问方式--格式：数组名
        System.out.println(arr);//[I@6e0be858是内存地址
        //输出数组中的元素 数组内部保存的数据的访问方式--格式：数组名[索引]--索引是数组中数据的编号方式，索引从0开始，连续的，逐一增加，每次加1
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //给数组中元素赋值（单个数组）
        arr[0]=100;
        arr[2]=200;
        //再次输出数组名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
