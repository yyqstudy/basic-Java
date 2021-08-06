package week3.生产者与消费者;

public class Box {
    //定义一个成员变量，表示第X瓶奶
    private int milk;
    //定义一个成员变量---表示box的状态
    private boolean state = false;//表示box没有牛奶

    //提供牛奶
    public synchronized void put(int milk){
        //如果有牛奶--等待消费者拿牛奶--if语句
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果没有牛奶，就提供牛奶
        this.milk = milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶放入奶箱");
        //生产完毕之后，修改奶箱状态
        state = true;
        //唤醒其它等待的线程
        notifyAll();
    }


    //拿牛奶
    public synchronized void get(){
        //如果没有牛奶，就等待
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有牛奶，就消费牛奶
        System.out.println("顾客拿到第"+this.milk+"瓶奶");

        //消费完毕之后，修改box状态
        state = false;
        //唤醒其它等待的线程
        notifyAll();
    }
}
