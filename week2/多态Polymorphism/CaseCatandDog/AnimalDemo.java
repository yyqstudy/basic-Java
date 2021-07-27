package week2.多态Polymorphism.CaseCatandDog;

/*
测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //多态形式--创建猫类对象进行测试
        //无参数
        Animal a = new Cat();//这里和继承里面的caseCatandDog不同

        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        //有参数
        a = new Cat("加菲",4);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
