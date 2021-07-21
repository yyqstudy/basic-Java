package day1.方法;

/*
要求：设计一个方法用于获取两个数中的较大数，数据来自于参数

思路：
1、定义一个方法，用于打印两个数字中的较大数，例如getMax()
  public static int getMax(int a,int b){}
2、使用分支语句分两种情况对两个数字的大小关系进行处理
  if(a>b){
            return a;
        }else{
        }
3、根据题设分别设置两种情况下对应的返回结果
  if(a>b){
            return a;
        }else{
            return b;
        }

4、在main()方法中调用定义好的方法并使用常量保存
  public static void main(String[] args) {
     int result = getMax(10,29);
     System.out.println(result);
  }
5、在main()方法中调用定义好的方法并直接打印结果
   public static void main(String[] args) {
      System.out.println(getMax(10,29));
   }



 */


public class case03Method_getMax_Return {
    public static void main(String[] args) {
        //在main()方法中调用定义好的方法并使用常量保存
        int result = getMax(10,29);
        System.out.println(result);
        //在main()方法中调用定义好的方法并直接打印结果
        System.out.println(getMax(10,29));
    }
    //定义一个方法，用于打印两个数字中的较大数，例如getMax()
    public static int getMax(int a,int b){
        //使用分支语句分两种情况对两个数字的大小关系进行处理
        //根据题设分别设置两种情况下对应的返回结果
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
