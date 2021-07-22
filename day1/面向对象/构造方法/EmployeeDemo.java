package day1.面向对象.构造方法;
//测试类
/*
如何调用构造方法呢?
通过new关键字调用
格式：类名 对象名 = new 构造方法(...);

 */
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.show();
    }
}

/*
构造方法的注意事项：
A:如果我们没有给出构造方法，系统将会提供一个默认的无参构造方法供我们使用。
B:如果我们给出了构造方法，系统将不在提供默认的无参构造方法供我们使用。
C:这个时候，如果我们想使用无参构造方法，就必须自己提供。
 推荐：自己给无参构造方法
建议：无论是否使用，都手工书写无参数构造方法

/*
	public Student() {
		System.out.println("这是构造方法");
	}

*/
    //public Employee() {}//无参数构造方法


