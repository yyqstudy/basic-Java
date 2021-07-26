package week2.继承.Demo3_构造方法;

public class Father_Constructor {
    //父类无参数构造方法
    //试一试注释掉无参数--子类方法报错--方法一--直接通过super(20)访问带参数构造方法
    //试一试注释掉无参数--子类方法报错--方法二--在父类手动提供无参数构造方法
    /* public Father_Constructor(){
        System.out.println("父类无参数构造方法被调用");
    */
    //方法二
    public Father_Constructor(){}
    //带参数构造方法
    public Father_Constructor(int age){
        System.out.println("父类带参数构造方法被调用");
    }
}
