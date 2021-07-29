package week2.异常;
/*
try……catch……处理异常

格式

try{
   可能出现异常的代码；
   }catch(异常类名 变量名){
   异常代码处理；
   }

throwable成员方法

方法名
public String getMessage()    返回此throwable的详细消息字符串
public String toString()      返回此可抛出的简短描述
public void printStackTrack() 把异常错误消息输出在控制台

 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");

    }
    public static void method(){
        try{
            int [] arr = {1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            //System.out.println("你访问的数组索引不存在");
//

            //public String getMessage()    返回此throwable的详细消息字符串
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            e.printStackTrace();
        }

    }
}
