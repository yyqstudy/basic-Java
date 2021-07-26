package week1.方法;

/*
带返回值方法定义
格式： public static 数据类型 方法名(参数){
        return数据;
      }

范例1：
       public static boolean isEvenNumber(int number){
        return true;
       }

范例2：
       public static int isEvenNumber(int a,int b){
        return 100;
       }
注意：方法定义时，return后面的返回值与方法定义上的数据类型要匹配，否则程序将报错

带返回值方法调用
格式1：方法名(参数);
范例1：isEvenNumber(5);

格式2：数据类型 变量名 = 方法名(参数);
范例2：boolean flag = isEvenNumber(5);

注意：方法的返回值通常使用变量接收（即格式2），否则该返回值将无意义



 */

public class Method_Return {
    public static void main(String[] args) {
        //1、方法名(参数);
        //isEvenNumber(5);//结果是false，但是无输出

        //2、数据类型 变量名 = 方法名(参数);
        boolean flag = isEvenNumber(5);
        System.out.println(flag);

    }
    //要求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数，并返回真假值
    public static boolean isEvenNumber(int number){
        if(number%2 == 0){
            return true;
        }else{
            return false;
        }

    }

}
