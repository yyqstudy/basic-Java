package week2.内部类.匿名内部类.Case;

public class RunningTest {
    public static void main(String[] args) {
        //
        RunningOperator ro  = new RunningOperator();

        Running r  = new Pandas();
        ro.method(r);


        Running r2  = new Tiger();
        ro.method(r2);
        System.out.println("---------");

        //如果不想像上述的一样，每次要建一个类才能调用方法，用下面代码块
        /*
        格式：
           new 类/接口(){
             重写方法;
           }；

         */
        ro.method(new Running(){
            @Override
            public void run() {
                System.out.println("Pandas rush rush rush");
            }
        });
        ro.method(new Running(){
            @Override
            public void run() {
                System.out.println("Tiger catch catch catch");
            }
        });
    }
}
