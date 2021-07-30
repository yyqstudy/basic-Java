package week2.集合进阶.泛型;
/*
测试类
 */
public class GenericDemo {
    public static void main(String[] args) {

        //此时可以定义为不同类型
        Generic<String> g1 = new Generic<String>();
        g1.setT("alice");
        System.out.println(g1.getT());

        System.out.println("-------------");

        Generic<Integer> g2 = new Generic<Integer>();
        g2.setT(20);
        System.out.println(g2.getT());

        System.out.println("--------------");

        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.setT(true);
        System.out.println(g3.getT());




    }
}
