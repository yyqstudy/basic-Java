package week1.方法;

/*
方法method是将具有独立功能对代码块组织成为一个整体，使其有特殊功能对代码集

方法定义：方法先创建才能使用，不然会报错
      格式： public static void 方法名(){
              //方法体
             }
      范例：  public static void isEvenNumber(){
              //方法体
             }


方法调用：方法创建后并不是直接运行，需要手动使用后才能执行,
        一般在main方法下方调用

        格式： 方法名();
        范例： isEvenNumber();

 */

public class Method {
    public static void main(String[] args) {
        //***调用方法的位置
        isEvenNumber();
    }
    //要求：定义一个方法，在方法中定义一个变量，判断该数据是否是偶数
    public static void isEvenNumber(){
        //定义变量
        int number = 10;
        //number = 9;
        //判断该数据是否是偶数
        if(number%2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
