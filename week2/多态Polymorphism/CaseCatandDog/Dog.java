package week2.多态Polymorphism.CaseCatandDog;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog cannot eat grape ");
    }
}
