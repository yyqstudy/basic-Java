package Debug;
//***注意
//如果数据来自于键盘输入，一定记住输入数据，不然就不能继续往下看
import java.util.Scanner;

public class Debug_getMax {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //接收数据
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();

        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        //调用方法
        int max = getMax(a,b);
        //输出结果
        System.out.println("较大的值是："+max);



    }

    public static int getMax(int a, int b) {
        if(a>b){
            return a;
        }else{
            return b;
        }

    }
}
