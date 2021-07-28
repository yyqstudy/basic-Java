package week2.接口Interface.Case02Coach_Athlete;
/*
具体类
 */
public class TableTennisCoach extends Coach implements SpeakEnglish{
    //无参数和带参数构造方法
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("TableTennisCoach teach how to play table tennis");
    }

    @Override
    public void eat() {
        System.out.println("TableTennisCoach eat vegetable");

    }

    @Override
    public void speak() {
        System.out.println("TableTennisCoach need to learn how to speak English");
    }
}
