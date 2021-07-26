package week2.static静态;

public class Scientist {
    //非静态成员变量
    private String name = "John von Neumann";
    //静态成员变量
    private static String university = "Eötvös Loránd Tudományegyetem";

    //非静态成员方法
    public void show1(){

    }
    //非静态成员方法--可以访问所有的静态成员方法、成员变量和非静态成员方法、成员变量

    public void show2(){
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }
    //静态成员方法--只能访问静态的成员变量和成员方法
    public static void show3(){
        //System.out.println(name);//报错
        System.out.println(university);
        //show1();//报错
        show3();

    }
    //静态成员方法
    public static void show4(){
    }
}
