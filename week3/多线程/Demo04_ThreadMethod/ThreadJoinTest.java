package week3.多线程.Demo04_ThreadMethod;
/*
void join(): 等待这个线程死亡（执行完毕），其它线程才可以执行
在测试类上写join()方法
 */
public class ThreadJoinTest {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.setName("康熙");
        tj2.setName("四阿哥");
        tj3.setName("八阿哥");

        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tj2.start();
        tj3.start();


    }
}
