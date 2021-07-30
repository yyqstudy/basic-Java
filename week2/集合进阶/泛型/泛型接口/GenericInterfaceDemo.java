package week2.集合进阶.泛型.泛型接口;

/*
测试类
 */
public class GenericInterfaceDemo {
    public static void main(String[] args) {
        GenericInterface<String> g1 = new GenericInterfaceImpl<String>();
        g1.show("little penny");

        GenericInterface<Integer> g2 = new GenericInterfaceImpl<Integer>();
        g2.show(33);
    }
}
