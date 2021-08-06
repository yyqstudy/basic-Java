package week3.线程同步;
/*
1、定义一个类SellTicket实现Runnable接口，里面定义一个成员变量：private int tickets = 100;
2、在类SellTicket中重写run()方法实现出售票，代码步骤如下：
   A、判断票数大于0---就出售票，并告知哪个窗口出售的
   B、出售票之后，总票数减1
   C、票没有了，也可能有人来询问---这里使用死循环while(true)让卖票动作一直执行
 */
public class SellTicket implements Runnable{
    private int tickets = 100;

    //2、在类SellTicket中重写run()方法实现出售票

    @Override
    public void run(){
//        A、判断票数大于0---就出售票，并告知哪个窗口出售的
//        B、出售票之后，总票数减1
//        C、票没有了，也可能有人来询问---这里使用死循环while(true)让卖票动作一直执行
       while(true){
           if(tickets > 0){
               System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
               //Thread.currentThread().getName()--在测试类会告知当前线程是哪个
               tickets--;
           }
       }

    }
}
