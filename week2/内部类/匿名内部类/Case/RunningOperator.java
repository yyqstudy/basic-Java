package week2.内部类.匿名内部类.Case;
/*
接口操作类，里面有一个方法，方法的参数是接口

接口作为形参和返回值
方法的形参是接口，其实需要的是该接口的实现类对象
 */
public class RunningOperator {
    public void method(Running r) { //new Pandas(); new Tiger()
        r.run();
    }
}
