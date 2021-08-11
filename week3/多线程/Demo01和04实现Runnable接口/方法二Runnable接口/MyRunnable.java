package week3.多线程.Demo01和04实现Runnable接口.方法二Runnable接口;
/*
1、定义一个类MyRunnable实现Runnable接口
2、在MyRunnable类中重写run()方法
 */
public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i <100 ; i++) {
            //MyRunnable没有继承Thread类，实现的是 Runnable接口---所以不能直接使用getName()---而是Thread.currentThread().getName()
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
