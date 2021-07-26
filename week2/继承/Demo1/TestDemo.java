package week2.继承.Demo1;

/*
测试类，有main方法
 */
public class TestDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Superclass f = new Superclass();
        f.show();

        Subclass s = new Subclass();
        s.method();
        s.show();//在Son.java中public class Son extends Father，此时可以调用show()
    }
}
