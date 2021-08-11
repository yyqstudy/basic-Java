package week3.多线程.Demo01和04实现Runnable接口;

public class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
