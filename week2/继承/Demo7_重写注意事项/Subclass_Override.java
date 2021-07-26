package week2.继承.Demo7_重写注意事项;

public class Subclass_Override extends Superclass_Override{

    /*@Override//报错，因为父类中私有private方法，子类不能重写
    private void show(){
        System.out.println("Subclass中show()方法被调用");
    }*/

   /* @Override
    public void method(){
        System.out.println("Subclass中method()方法被调用");
    }*/

    @Override
    void method(){
        System.out.println("Subclass中method()方法被调用");
    }

}
