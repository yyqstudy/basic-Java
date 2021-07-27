package week2.接口Interface;
//类实现接口--关键字implements
public class Kangaroo implements JumppingInterface{
    @Override
    public void jump() {
        System.out.println("袋鼠跳");
    }
}
