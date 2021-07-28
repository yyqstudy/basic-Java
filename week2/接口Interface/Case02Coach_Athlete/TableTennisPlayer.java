package week2.接口Interface.Case02Coach_Athlete;
/*
具体类
 */
public class TableTennisPlayer extends Athlete implements SpeakEnglish{
    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("TableTennisPlayer study");
    }

    @Override
    public void eat() {
        System.out.println("TableTennisPlayer eat");
    }

    @Override
    public void speak() {
        System.out.println("TableTennisPlayer speak English");
    }
}
