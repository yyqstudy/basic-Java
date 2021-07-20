package day1.流程控制;

/*
基本格式：

 do{
  循环体语句；
 } while(条件判断语句);

完整格式：

初始化语句；
 do{
   循环体语句；
   条件控制语句；
  } while(条件判断语句);

执行流程：
1、执行初始化语句
2、执行循环体语句
3、执行条件控制语句
4、执行条件判断语句，看其结果是true还是false
   如果是false，循环结束
   如果是true，继续执行
5、回到步骤2继续
 */

public class do_while {
    public static void main(String[] args) {
        //for循环
        for (int i=1; i<=5; i++) {
            System.out.println("HelloWorld");
        }

        System.out.println("---------");
        //do……while循环
        int j = 1;
        do {
            System.out.println("HelloWorld");
            j++;
        }while(j<=5);
    }
}

/*
**三种循环区别
1、for循环和while循环先判断后执行
2、do…while先执行一次循环体，然后判断条件是否成立（先执行后判断）
**for与while区别
条件控制语句的自增变量，在for循环结束后不能再次被访问；而while可以
**死循环格式
for(::){}
while(true){}
do{}while(true)


 */