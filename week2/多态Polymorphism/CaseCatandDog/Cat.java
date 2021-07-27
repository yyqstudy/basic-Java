package week2.多态Polymorphism.CaseCatandDog;

public class Cat extends Animal{
    //快捷键command+N+I
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    //重写eat()

    @Override
    public void eat() {
        System.out.println("Cat eat cheese");
    }
}
