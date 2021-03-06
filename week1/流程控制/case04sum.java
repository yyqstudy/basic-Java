package week1.流程控制;

/*求和
要求：求1～5之间的数据和，并把数据结果在控制台输出
 */

public class case04sum {
    public static void main(String[] args) {
        //求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
        int sum = 0;
        //从1开始到5结束到数据，使用循环结构完成
        for(int i=1; i<=5;i++){
            //将反复进行到事情写进循环结构内部，此处反复进行的事情是将数据1加到用于保存求和变量的sum中
            sum += i;
            /*
             sum += i 也就是 sum = sum + i;
             i++;
             第一次：i=1 sum = sum + i = 0+1=1；
             第二次：i=2 sum = sum + i = 1+2=3；
             第三次：i=3 sum = sum + i = 3+3=6；
             第四次：i=4 sum = sum + i = 6+4=10；
             第五次：i=5 sum = sum + i = 10+5=15；
             */

        }
        System.out.println("1~5之间的数据和是："+sum);

        //求1～100之间的偶数和
        //求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
        int total = 0;
        //对1～100的数据求和与1～5数据求和几乎完全一样，仅仅是结束条件不同
        for(int a=1; a<=100;a++){
            //对1～100的偶数求和，需要对求和操作添加限制条件，判断是否是偶数--参考If
            if(a%2 == 0){
                total += a;
            }
        }
        System.out.println("1~100之间的数据和是："+total);
    }
}
