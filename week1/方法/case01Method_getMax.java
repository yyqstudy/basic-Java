package week1.方法;

/*
case:设计一个方法用于打印两个数中的较大数
分析思路：
1、定义一个方法，用于打印两个数字中的较大数，例如getMax()

   public static void getMax(){}

2、方法中定义两个变量，用于保存两个数字

   public static void getMax(){
        int a = 10;
        int b = 20;
    }

3、使用分支语句分两种情况对两个数字的大小关系进行处理

    if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

4、在main()方法中调用定义好的方法****这个经常会忘

     public static void main(String[] args) {
        //在main()方法中调用定义好的方法
        getMax();

 */

public class case01Method_getMax {
    public static void main(String[] args) {
        //在main()方法中调用定义好的方法
        getMax();

    }
    //定义一个方法，用于打印两个数字中的较大数，例如getMax()
    public static void getMax(){
        //方法中定义两个变量，用于保存两个数字
        int a = 10;
        int b = 20;
        //使用分支语句分两种情况对两个数字的大小关系进行处理
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
