package week3.Lambda表达式;

import week3.多线程.Demo01和04实现Runnable接口.方法二Runnable接口.MyRunnable;

public class Test {
    public static void main(String[] args) {
        //------创建class的方式实现需求
        //3、创建MyRunnable类的对象
        RunnableClass rc = new RunnableClass();
        //4、创建Thread类的对象，把MyRunnable对象作为构造方法的参数
        Thread t = new Thread(rc);
        //启动线程
        t.start();


        //------匿名内部类改进---和方式一相比不用创建MyRunnable类，只在一个java文件就可操作
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程程序启动了");
            }
        }).start();

        //------Lambda表达式的方式改进---() -> {}
        new Thread(() -> {
            System.out.println("多线程程序启动了");
        }).start();





    }
}
