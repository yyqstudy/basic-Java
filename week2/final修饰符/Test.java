package week2.final修饰符;
/*
测试类
 */
public class Test {
    public static void main(String[] args) {
        Subclass Sc = new Subclass();
        Sc.method();//虽然不能override，但是继承父类，还是可以用的,输出的是父类Superclass method
        Sc.show();
    }
}
