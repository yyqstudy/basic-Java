package week1.方法;

/*
方法重载
  多个方法在同一类中
  多个方法具有相同的方法名
  多个方法的参数不相同，类型不同或者数量不同

  方法重载与返回值无关
  在调用时候，Java虚拟机会通过参数的不同来区分同名的方法
 */
public class Method_Overloading {
    public static void main(String[] args) {
        //调用方法
        int result = sum(10,10);
        System.out.println(result);

        double result2 = sum(10.0,10.0);
        System.out.println(result2);

        int result3 = sum(10,10,30);
        System.out.println(result3);

    }
    //要求：求两个int类型的数据和的方法
    public static int sum(int a, int b){
        return a+b;
    }
    //要求：求两个double类型的数据和的方法
    public static double sum(double a, double b){
        return a+b;
    }
    //要求：求三个int类型数据和的方法
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
}
