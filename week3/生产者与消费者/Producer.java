package week3.生产者与消费者;

public class Producer implements Runnable{
    //通过构造方法给成员变量赋值
    private Box b;

    public Producer(Box b){this.b = b;}

    @Override
    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            b.put(i);
        }
    }
}
