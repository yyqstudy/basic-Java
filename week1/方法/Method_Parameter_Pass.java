package week1.方法;
/*
方法参数传递
对于基本数据类型的参数，形参的改变，不影响实参的值
 */

/*
形参：方法定义中的参数：数据类型 变量名，例：int number
实参：方法调用的参数：10、number
 */

public class Method_Parameter_Pass {
    public static void main(String[] args) {
        int number =100;//实参：方法调用的参数
        System.out.println("调用change方法前："+number);//输出语句缩写是syso()
        change(number);
        System.out.println("调用change方法后："+number);
    }

    public static void change(int number) {
        number = 200;//形参：方法定义中的参数

    }
}
