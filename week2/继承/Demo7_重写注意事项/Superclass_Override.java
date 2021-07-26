package week2.继承.Demo7_重写注意事项;

public class Superclass_Override {
    //private和public都是访问权限修饰符
    private void show(){
        System.out.println("Superclass中show()方法被调用");
    }
    /*public void method(){
        System.out.println("Superclass中method()方法被调用");
    }*/

    //去掉public
    void method(){
        System.out.println("Superclass中method()方法被调用");
    }
}
