package week2.异常;
/*
throws处理异常把异常抛出去，如果要往下执行，还是要用try……catch
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
    public static void main(String[] args) {

    }

    //编译时异常--必须显示处理
    public static void method() throws ParseException {
        String s = "2048-08-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }

    //运行时异常
    public static void method2(){
        try{
            int[] arr ={1,2,3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    //throws处理异常---格式 throws 异常类名；

    public static void method3() throws ArrayIndexOutOfBoundsException{
        int[] arr ={1,2,3};
        System.out.println(arr[3]);
    }
}
