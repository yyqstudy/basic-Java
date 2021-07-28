package week2.内部类.匿名内部类;
/*
前提：存在一个类或者接口，这里的类可以是具体类或者抽象类

本质是：一个继承该类或者实现该接口的子类匿名对象--只不过对象是没有名字而已

格式：
    new 类/接口(){
      重写方法;
    };

 */
public class Outer_AnonymousClass {
    public void method(){
       /* //按照格式来写
        new AnonymousClass(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };*/
       //要调用show()方法，才能在Outer_AnonymousClassDemo会有输出
        //对象就可以调用方法  对象.方法名()
       /* new AnonymousClass() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();*/

        //多次调用--多态形式
        AnonymousClass ac = new AnonymousClass() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        ac.show();
        ac.show();
        ac.show();
        ac.show();
    }
}
