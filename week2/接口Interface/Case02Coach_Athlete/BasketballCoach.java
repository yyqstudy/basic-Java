package week2.接口Interface.Case02Coach_Athlete;
/*
具体类
 */
public class BasketballCoach extends Coach{
    //构造方法
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    //继承coach，要重写coach的方法teach()--coach继承的是human being，要继续重写human being的方法eat()
    @Override
    public void teach() {
        System.out.println("basketball coach teach how to play basketball");
    }

    @Override
    public void eat() {
        System.out.println("Basketball coach eat mutton ");
    }

}
