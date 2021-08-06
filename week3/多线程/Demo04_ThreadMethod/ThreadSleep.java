package week3.多线程.Demo04_ThreadMethod;

public class ThreadSleep extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            try {
                Thread.sleep(1000);//1000毫秒=1秒，就是让每个对象都执行一次，然后停留1秒，再执行下去
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
