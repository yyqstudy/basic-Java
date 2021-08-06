package week3.多线程.Demo02_SetAndGetName;
/*
  void setName(String name):将此线程的名称更改参数name
  String getName():返回此线程的名称
 */
public class MyThread_NameTest {
    public static void main(String[] args) {
        //void setName(String name):将此线程的名称更改参数name
        //方法一：无参数构造--getName()在MyThread
       /* MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        m1.setName("高达");
        m2.setName("皮卡丘");
        m1.start();
        m2.start();*/



        //--------------------------
        //方法二：通过带参数构造
       /* MyThread m1 = new MyThread("精灵球");
        MyThread m2 = new MyThread("魔法杖");
        m1.start();
        m2.start();*/

        //--------------------------
        //static Thread currentThread():返回对当前正在执行的线程对象的引用---现在是获取main()线程的名字
        System.out.println(Thread.currentThread().getName());
    }
}
