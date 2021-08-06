package week3.多线程.Demo01.方法二Runnable接口;

public class MyRunnableTest {
    public static void main(String[] args) {
        //3、创建MyRunnable类的对象
        MyRunnable mr = new MyRunnable();

        //4、创建Thread类的对象，把MyRunnable对象作为构造方法的参数
        //Thread(Runnable target)
        /*Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);*/


        //----------------
        //带参数
        //Thread(Runnable target,String name)
        Thread t1 = new Thread(mr,"阿凡达");
        Thread t2 = new Thread(mr,"哥斯拉");

        //启动线程
        t1.start();
        t2.start();

    }
}
