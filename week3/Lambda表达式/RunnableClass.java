package week3.Lambda表达式;

public class RunnableClass implements Runnable{

    /*
    1、定义一个类MyRunnable实现Runnable接口
    2、在MyRunnable类中重写run()方法
     */

        @Override
        public void run(){
            System.out.println("多线程程序启动了");
        }


}
