package week3.线程同步;
/*
3、定义一个测试类SellTicketTest,里面有main方法，代码步骤如下：
   A、创建类SellTicket对象
   B、创建三个Thread类的对象---3个窗口
      把SellTicket对象作为构造方法参数，并给出对应的窗口名 ---Thread(Runnable target,String name)
   C、启动线程
 */
public class SellTicketTest {
    public static void main(String[] args) {
        // A、创建类SellTicket对象
        SellTicket st = new SellTicket();

        // B、创建三个Thread类的对象---3个窗口---把SellTicket对象作为构造方法参数，并给出对应的窗口名 ---Thread(Runnable target,String name)
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
