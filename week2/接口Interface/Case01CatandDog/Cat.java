package week2.接口Interface.Case01CatandDog;

public class Cat extends Animal implements Jumpping{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }

    @Override
    public void jump() {
        System.out.println("cat can jump");
    }
}
