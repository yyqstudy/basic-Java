package week2.多态Polymorphism;

public class Cat extends Animal{

    public int age = 20;
    public int weight =10;
    @Override
    public void eat() {
        System.out.println("Cat eat fish");
    }
    public void playGame(){
        System.out.println("Cat is playing game");
    }
}
