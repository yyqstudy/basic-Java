package week2.继承.Demo3_构造方法;

public class Son_Constructor extends Father_Constructor {
    //父类无参数构造方法
    public Son_Constructor(){
        //super();写不写，输出都一样
        super(20);//可以指定访问父类带参数构造方法
        System.out.println("子类无参数构造方法被调用");
    }
    //带参数构造方法
    public Son_Constructor(int age){
        //super();
        super(20);
        System.out.println("子类带参数构造方法被调用");
    }
}
