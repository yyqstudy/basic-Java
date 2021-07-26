package week2.继承.Demo3_构造方法;
/*
测试类
带main
 */
public class Test_Constructor {
    public static void main(String[] args) {
        //创建对象
        //无参数
        Son_Constructor sc = new  Son_Constructor();//子类无参数构造方法被调用，为什么也会访问父类无参数方法？
        //带参数
        Son_Constructor sc1 = new  Son_Constructor(20);//子类带参数构造方法被调用，为什么还是会访问父类无参数方法？
    }
}
