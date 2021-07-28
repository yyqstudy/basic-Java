package week2.接口Interface.Case01CatandDog;
/*
测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建接口对象--参照多态--实例化,调用方法
        //接口只能调用接口对方法
        Jumpping j = new Cat();
        j.jump();
        System.out.println("---------");

        //******************
        //抽象类方法只能调用自己里面的方法
        //无参数构造
        Animal a = new Cat();
        a.setName("黑猫");
        a.setAge(1);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        //a.jump();//报错，因为 a 是Animal,Animal.java里面没有jump()

        //带参数构造
        a = new Cat("加菲",2);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("---------");


        //********************
        //最终使用的是子类，而不是接口或者父类，因为子类有最多的方法
        Cat c = new Cat();
        c.setName("黑猫");
        c.setAge(1);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();
    }
}
