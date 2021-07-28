package week2.内部类.成员内部类;

public class MemberNested {
    //成员变量
    private int num = 10;
    //不常见的内部类写法
    //内部类主要是不想让别人看到的内容
    /*public class Inner{
        public void show(){
            System.out.println(num);
        }
    }*/


    private class Inner{
        public void show(){
            System.out.println(num);
        }
    }
     public void method(){
        Inner i = new Inner();
        i.show();
     }
}
