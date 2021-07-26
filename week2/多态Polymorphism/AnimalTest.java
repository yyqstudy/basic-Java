package week2.多态Polymorphism;
/*

测试类

多态的前提和体现
1）有继承/实现关系  继承---extends
2）有方法重写---override
3）有父类引用指向子类对象
 */
public class AnimalTest {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a = new Cat();
        System.out.println(a.age);
        /*多态访问成员对象，编译与运行都看Animal a = new Cat();的左边Animal
        Animal没有weight所以报错
        输出的是Animal a的年龄而不是cat的年龄
*/
        //System.out.println(a.weight);//报错

        //访问成员方法--也是看Animal里面有没有，但是运行结果看Cat，即右边，输出的是Cat eat fish
        a.eat();
        //a.playGame();//报错


    }
}
