package week3.多线程.Demo01和04实现Runnable接口;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        //m1.run();//输出结果按顺序0-99
        //m2.run();

        //void start()导致此线程开始执行，JVM调用此线程的run()方法
        //此时输出结果不按顺序
        m1.start();
        m2.start();
    }
}
