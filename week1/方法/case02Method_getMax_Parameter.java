package week1.方法;

/*
case:设计一个方法用于打印两个数中的较大数
分析思路：
1、定义一个方法，用于打印两个数字中的较大数，例如getMax()

  public static void getMax(){}

2、方法中定义两个参数，用于接收两个数字

  public static void getMax(int a,int b){}

3、使用分支语句分两种情况对两个数字的大小关系进行处理

   if(a>b){
     System.out.println(a);
   }else{
      System.out.println(b);
   }

4、在main()方法中调用定义好的方法(使用常量）
   public static void main(String[] args) {
        //直接传递常量
        getMax(10,20);

5、在main()方法中调用定义好的方法(使用变量）
   public static void main(String[] args) {
        //定义变量，传递
        int a = 10;
        int b = 20;
        getMax(a,b);
    }

*/
public class case02Method_getMax_Parameter {
    public static void main(String[] args) {
        //在main()方法中调用定义好的方法(使用常量）
        getMax(10,20);
        //调用方法时，人家要几个，你就给几个；人家要什么类型，你就给什么类型
        //getMax(30);//报错
        //getMax(10.0,20.0);//报错


        //在main()方法中调用定义好的方法(使用变量）
        int a = 10;
        int b = 20;
        getMax(a,b);
    }
    //定义一个方法，用于打印两个数字中的较大数，例如getMax()
    //方法中定义两个参数，用于接收两个数字
    public static void getMax(int a,int b){
        //使用分支语句分两种情况对两个数字的大小关系进行处理
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

}
