package week2.继承.Demo6_重写;
/*
测试类

方法重写
子类中出现和父类一模一样的声明

方法重写的应用
当子类需要父类的功能，而功能主体子类有自己特有的内容时候，可以重写父类中的方法
这样，既沿袭父类的功能，又定义子类特有内容
练习：手机类和新手机类

@Override
是一个注解
可以帮助我们检查重写方法的方法声明的正确性
 */
public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Phone p = new Phone();
        p.call("Alice");

        System.out.println("__________");
        NewPhone np = new NewPhone();
        np.call("Albert");
    }
}
