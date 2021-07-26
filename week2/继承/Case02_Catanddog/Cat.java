package week2.继承.Case02_Catanddog;

public class Cat extends Animal{
    //快捷键command+N+I
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
