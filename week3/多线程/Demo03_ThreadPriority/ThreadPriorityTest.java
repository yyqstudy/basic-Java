package week3.多线程.Demo03_ThreadPriority;
/*
Thread类设置和获取线程优先级的方法：
public final int getPriority():返回此线程的优先级
public final void setPriority(int newPriority):更改此线程的优先级
 */
public class ThreadPriorityTest {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("A");
        tp2.setName("B");
        tp3.setName("C");

        /*//public final int getPriority():返回此线程的优先级
        System.out.println(tp1.getPriority());//5
        System.out.println(tp2.getPriority());//5
        System.out.println(tp3.getPriority());//5

        //public final void setPriority(int newPriority):更改此线程的优先级
        //获取线程优先级范围----是1～10
        System.out.println(Thread.MAX_PRIORITY);//10
        System.out.println(Thread.MIN_PRIORITY);//1
        System.out.println(Thread.NORM_PRIORITY);//5*/

        //设置正确的优先级
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();


    }
}
