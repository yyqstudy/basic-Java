package week2.继承.Case02_Catanddog;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    public void Guard(){
        System.out.println("看门狗");
    }
}
