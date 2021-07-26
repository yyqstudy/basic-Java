package week1.流程控制;

/* for语句
   格式：
      for(初始化语句;条件判断语句；条件控制语句）{
            循环体语句;
      }

   执行流程：
    1、执行初始化语句
    2、执行条件判断语句，看其结果是true还是false
       如果是false，循环结束
       如果是true，继续执行；执行循环体；执行条件控制语句；执行条件判断语句，看其结果是true还是false

 */

public class For {
    public static void main(String[] args) {
        //要求：在控制台输出5次"HelloWorld"
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("----------");

        //用for循环改进  要求：在控制台输出5次"HelloWorld"
        //初始化语句:int i=1; 条件判断语句:i<=5; 条件控制语句:i++; 循环体语句：System.out.println("HelloWorld");
        for (int i=1; i<=5; i++) {
            System.out.println("HelloWorld");
        }



        /*案例要求：在控制台输出1～5和5～1
        分析：
        1、反复进行输出动作，使用循环结构

          for(初始化语句;条件判断语句；条件控制语句）{
            循环体语句;
      }
      2、从5到1结束，设置初始化从5开始

      for(int i=5;条件判断语句；条件控制语句）{
            循环体语句;
      }

      3、从5到1结束，设置判断条件为没有到1的时候继续执行，执行到小于1，程序结束

       for(int i=5;i>=1;条件控制语句）{
            循环体语句;
      }

      4、从5到1，每次减少1，设置条件控制每次减1

      for(int i=5;i>=1;条件控制语句）{
            循环体语句;
      }

      5、将反复进行到事情写入循环结构内部，输出对应数据

      for (int i=5; i>=1; i--){
            System.out.println(i);
        }

         */
        //要求：在控制台输出1～5
        for (int i=1; i<=5; i++){
            System.out.println(i);
        }
        System.out.println("----------");
        //要求：在控制台输出5～1
        for (int i=5; i>=1; i--){
            System.out.println(i);
        }

    }
}
