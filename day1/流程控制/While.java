package day1.流程控制;

//while循环语句格式
//和for循环很相似，就是语句的位置不同而已，while循环适合循环次数未知；而for循环则是适合循环次数已知
/*
基本格式：
while（条件判断语句）{
    循环体语句；
         }

完整格式：
初始化语句；
while(条件判断语句）{
         循环体语句；
         条件控制语句；
         }


执行流程：（同for循环一样）
1、执行初始化语句
2、执行条件判断语句，看其结果是true还是false
       如果是false，循环结束
       如果是true，继续执行；执行循环体；执行条件控制语句；执行条件判断语句，看其结果是true还是false

 */



public class While {
    public static void main(String[] args) {
        //要求：在控制台输出5次"HelloWorld"
        //for循环实现
        /*
        for(初始化语句;条件判断语句；条件控制语句）{
            循环体语句;
         }
         */
        for (int i=1; i<=5; i++) {
            System.out.println("HelloWorld");
        }

        System.out.println("---------");

        //while循环实现，按照格式改写
        int j = 1;
        while(j<=5){
            System.out.println("HelloWorld");
            j++;
        }
    }
}
