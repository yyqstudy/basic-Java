package day1.面向对象;

public class Phonedemo {
    public static void main(String[] args) {
        //创建对象
        //  格式： 类名 对象名 = new 类名();
        Phone p = new Phone();

        //使用成员变量,这时输出默认值
        System.out.println(p.brand);
        System.out.println(p.price);
        //赋值
        p.brand = "Apple";
        p.price = 6000;
        System.out.println(p.brand);
        System.out.println(p.price);

        //使用成员方法**why
        p.call();
        p.sendMessage();
    }
}
