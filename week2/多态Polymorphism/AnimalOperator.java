package week2.多态Polymorphism;
/*
动物操作类
 */
public class AnimalOperator {
    //useAnimal(Cat c)中Cat c 相当于 Cat c = new Cat();
   /* public void useAnimal(Cat c){
        c.eat();
    }
    public void useAnimal(Dog d){
        d.eat();
*/


   //传输多种动物时候，不仅要创建对应动物的类，在AnimalTest上调用对应动物方法
   // 还要在AnimalOperator上添加useAnimal方法---这里可以简单化
    public void useAnimal(Animal a){
        //Animal a = new Cat();
        // 编译看左边，执行看右边.左边查看Animal.java,里面有eat()方法；右边看Cat.java,里面有eat(),输出是Cat eat fish
        //dog也是一样
        a.eat();
        //a.playGame();//报错，不能访问其中一个子类特有的功能

    }
}
