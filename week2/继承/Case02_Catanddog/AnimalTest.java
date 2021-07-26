package week2.继承.Case02_Catanddog;
/*
测试类
 */
public class AnimalTest {
    public static void main(String[] args) {
        //创建Cat类对象，进行测试
        //无参数
        Cat c1 = new Cat();
        c1.setName("加菲猫");
        c1.setAge(5);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.catchMouse();

        //有参数
        Cat c2 = new Cat("橘猫",2);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.catchMouse();


        //创建Cat类对象，进行测试
        //无参数
        Dog d1 = new Dog();
        d1.setName("泰迪犬");
        d1.setAge(5);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.Guard();

        //有参数
        Dog d2 = new Dog("拉布拉多犬",2);
        System.out.println(d2.getName()+","+d2.getAge());
        d2.Guard();

    }
}
