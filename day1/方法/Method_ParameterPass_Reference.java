package day1.方法;
/*
方法参数传递（引用类型）
对于引用类型的参数，形参的改变，影响实参的值
 */
public class Method_ParameterPass_Reference {
    public static void main(String[] args) {
        int [] arr = {10,20,30};//实参：方法调用的参数
        System.out.println("调用change方法前："+arr[1]);//输出语句缩写是syso()
        change(arr);
        System.out.println("调用change方法后："+arr[1]);
    }

    public static void change(int [] arr) {
        arr[1] = 200;//形参：方法定义中的参数
    }
}
