package week2.final修饰符;

public class Superclass {
    //被final修饰的方法不能被override
    public final void method(){
        System.out.println("Superclass method");
    }
}

//在父类前用final修饰，报错，最终类不能有子类继承
/*public final class Superclass {
    //被final修饰的方法不能被override
    public final void method() {
        System.out.println("Superclass method");
    }
}*/
