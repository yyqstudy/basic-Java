package week2.内部类.成员内部类;
/*
测试类
 */
public class InnerDemo {
    public static void main(String[] args) {
        //创建内部类对象，并调用方法
        //Inner i = new Inner();//报错
        /*MemberNested.Inner mi = new MemberNested().new Inner();
        mi.show();*/

        //不能直接调用show()
        //间接调用show()方法--通过MemberNested中的method()间接调用
        MemberNested m = new MemberNested();
        m.method();

    }
}
