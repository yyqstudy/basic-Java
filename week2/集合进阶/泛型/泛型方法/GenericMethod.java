package week2.集合进阶.泛型.泛型方法;

/* //泛型类改进
public class GenericMethod <T>{
    public void show(T t){
        System.out.println(t);
    }
}*/

//泛型方法改进
public class GenericMethod{
    public <T> void show(T t){
        System.out.println(t);
    }
}
