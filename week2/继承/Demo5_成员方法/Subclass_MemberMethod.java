package week2.继承.Demo5_成员方法;
public class Subclass_MemberMethod extends Superclass_MemberMethod {
    public void method(){
        System.out.println("Subclass_MemberMethod中的method()方法被调用");
    }
    //父类有show方法，此时在子类写一个show方法，看看结果如何--测试类中sMM.show()调用子类的show方法
    public void show(){
        super.show();//此时输出父类的show方法被调用
        System.out.println("Subclass_MemberMethod中的show()方法被调用");
    }
}