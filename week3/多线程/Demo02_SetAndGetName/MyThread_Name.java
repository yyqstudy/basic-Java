package week3.多线程.Demo02_SetAndGetName;

public class MyThread_Name extends Thread{
    //带参数构造要写的
    //要到Thread Class中提供一个带参数构造方法---通过super()去访问父类的带参数构造
    public MyThread_Name(){}

    public MyThread_Name(String name){
        super(name);
    }

    //-------------------
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
