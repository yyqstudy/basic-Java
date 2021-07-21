package day1.方法;

//方法不能嵌套，即方法不能套方法
//这是分开的
public class Method_Remaining {
    public static void methodOne(){

    }
    public static void methodTwo() {

    }
}
//void表示无返回值，可以省略return，也可以单独书写return，后面不能加数据

/*
方法的通用格式
格式：
   public static 返回值类型 方法名(参数){
      方法体;
      return 数据;
   }

   public static 修饰符，目前记住这个格式
   返回值类型 方法操作完毕后返回数据的数据类型
            如果方法操作完毕，没有数据返回，这里写void，而且方法体中一般不写return
   方法名   调用方法时候使用的标识
   参数     由数据类型和变量名组成，多个参数之间逗号隔开
   方法体   完成功能的代码
   return  如果方法操作完毕，有数据返回，用于将数据返回调用者

 */
/*
定义方法时，两个明确
  1、明确返回值类型：方法操作完毕之后是否有数据返回，如果没有，写void；如果有，写对应的数据类型
  2、明确参数类型：主要明确参数的类型与数量

调用方法：
  1、void类型的方法，直接调用即可
  2、非void类型的方法，推荐使用变量接收调用---数据类型 变量名 = 方法名(参数);---boolean flag = isEvenNumber(5);

 */