package week2.接口Interface.Case02Coach_Athlete;
/*
抽象类
 */
public abstract class Coach extends Humanbeing{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
