package week2.final修饰符;

public class Subclass extends Superclass {

    /*@Override
    public void method(){
        System.out.println("Subclass method");
    }*/


    public final int age = 20;//final修饰之后，下面的age报错
    public void show(){
        //age = 100;
        System.out.println(age);
    }
}
