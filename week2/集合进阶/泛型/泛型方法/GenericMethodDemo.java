package week2.集合进阶.泛型.泛型方法;

import week2.集合进阶.泛型.泛型方法.GenericMethod;

/*
测试类
 */
public class GenericMethodDemo {
    public static void main(String[] args) {
        /*//泛型类改进后测试
        GenericMethod<String> g1 = new GenericMethod<String>();
        g1.show("alice");
        GenericMethod<Integer> g2 = new GenericMethod<Integer>();
        g2.show(30);
        GenericMethod<boolean> g3 = new GenericMethod<boolean>();
        g3.show(true);
        */


        /*
        泛型方法
         在测试类时候，创建对象不明确类型 直接用Generic g = new Generic();调用方法时候明确类型
         */
        GenericMethod g = new GenericMethod();
        g.show("Rabbit");
        g.show(1);
        g.show(true);
        g.show(12.34);


    }
}
