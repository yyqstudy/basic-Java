package week1.方法;

/*
带参数方法定义
格式：public static void方法名(参数){……}
格式（单个参数）：public static void方法名(数据类型 变量名){……}
范例（单个参数）：public static void isEvenNumber(int number){……}

格式（多个参数）：public static void方法名(数据类型 变量名1,数据类型 变量名2,……){……}
范例（多个参数）：public static void isEvenNumber(int number1,int number2){……}

方法定义时，数据类型与变量名都不能少，缺一系统报错
方法定义时，多个参数之间使用（,）分隔

带参数方法调用
格式：方法名(参数);
格式（单个参数）：方法名（变量名/常量名）;
范例（单个参数）：isEvenNumber(5)

格式（多个参数）：方法名(变量名1/常量名1,变量名2/常量名2)
范例（多个参数）：getMax(5,6)
方法调用时，参数多数量与类型必须与方法定义中多设置相匹配，否则程序报错


 */

//方法定义 public static void方法名(参数){……}
//方法调用 方法名(参数);
public class method_havingParameter {
    public static void main(String[] args) {
        //常量值调用
        //isEvenNumber(10);
        //变量调用
        int number = 10;
        isEvenNumber(number);
        //System.out.println(isEvenNumber(10));//报错，出现了不允许使用空类型
    }
    //要求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数
    public static void isEvenNumber(int number) {
        if(number%2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
/*
形参：方法定义中的参数：数据类型 变量名，例：int number
实参：方法调用的参数：10、number
 */