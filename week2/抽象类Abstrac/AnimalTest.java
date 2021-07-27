package week2.抽象类Abstrac;
/*
测试类--与多态测试类一模一样
 */
public class AnimalTest {
    public static void main(String[] args) {
        //创建对象，按照多态的方式

        //无参数构造
        Animal a = new Cat();
        a.setName("牛奶");
        a.setAge(3);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("-------------");

        //带参数构造
        a = new Cat("黑猫警长",2);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
