package week3.多线程.Demo04_ThreadMethod;
/*
测试类
static void sleep(long millis): 使当前正在执行的线程停留（暂时执行）指定的毫秒数--- millis---long类型
                                在类书写代码，而不是测试类
 */
public class ThreadSleepTest {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.setName("曹操");
        ts2.setName("刘备");
        ts3.setName("孙权");

        ts1.start();
        ts2.start();
        ts3.start();

    }
}
