package week3.生产者与消费者;

public class Customer implements Runnable{
    private Box b;
    public Customer(Box b){
        this.b =b;
    }

    @Override
    public void run(){
        while(true){
            b.get();//死循环，不断的拿牛奶
        }

    }

}
