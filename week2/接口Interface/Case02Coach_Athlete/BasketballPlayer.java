package week2.接口Interface.Case02Coach_Athlete;
/*
具体类
 */
public class BasketballPlayer extends Athlete{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("BasketballPlayer study");
    }

    @Override
    public void eat() {
        System.out.println("BasketballPlayer eat");
    }
}
