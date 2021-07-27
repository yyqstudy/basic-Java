package week2.接口Interface;
/*
测试类
 */
public class JumppingTest {
    public static void main(String[] args) {
        //创建接口对象--参照多态--实例化
        //JumppingInterface j = new JumppingInterface(); //报错

        JumppingInterface j = new Kangaroo();
        j.jump();





    }
}
