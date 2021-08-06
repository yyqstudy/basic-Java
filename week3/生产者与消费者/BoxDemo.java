package week3.生产者与消费者;

import javax.swing.*;

public class BoxDemo {
    public static void main(String[] args) {
        //
        Box b = new Box();

        //
        Producer p = new Producer(b);

        Customer c = new Customer(b);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        //启动线程
        t1.start();
        t2.start();


    }
}
