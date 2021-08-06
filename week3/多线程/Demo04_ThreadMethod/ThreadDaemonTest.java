package week3.多线程.Demo04_ThreadMethod;
/*
void setDaemon(boolean on):将此线程标记为守护线程，当运行的线程都是守护线程时候，Java虚拟机将退出
                           主线程执行完毕后，守护线程也要执行完毕，但不会立即消失
                           在测试类上写setDaemon()

 */
public class ThreadDaemonTest {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("张飞");
        td2.setName("关羽");

        //设置主线程--刘备
        Thread.currentThread().setName("刘备");

        //设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+","+i);
        }
    }
}
