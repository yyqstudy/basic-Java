package week2.接口Interface.Case02Coach_Athlete;
/*
抽象类
 */
public abstract class Athlete extends Humanbeing{
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }
    public abstract void study();
}
