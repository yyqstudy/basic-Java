package week2.内部类.局部内部类;

public class Outer_LocalClass {
    //成员变量
    private int num = 19;
    //成员方法
    public void method(){
        //局部内部类--外界无法直接访问--要通过Outer_LocalClass调用method()来间接访问
        //定义局部变量
        int num2 = 21;
        class Inner{
            public void show(){
                //该类可以直接访问外部类的成员，也可以访问方法内的局部变量
                System.out.println(num);
                System.out.println(num2);
            }
        }
        //create object
        //如果这里不创建对象，那么在LocalClassDemo中的o.method()无输出
        //局部内部类是在方法中定义的类，所以外界是无法直接使用的，需要在方法内部创建对象并使用
        Inner i = new Inner();
        i.show();
    }
}
