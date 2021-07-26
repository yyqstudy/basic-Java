package week1.面向对象;
//类同数组中Multi_Array_SameAddr.java
//当内存地址相同时候，其中一个对象修改了堆内存堆内容，另一个对象去访问时候，内容也是会改变的
public class MultiObject_SameAddr {
    public static void main(String[] args) {
        //创建第一个对象并使用
        Student s1 = new Student();
        s1.name = "Albert";
        s1.age = 18;
        System.out.println("s1的姓名是和年龄是："+s1.name+","+s1.age);
        //把第一个对象的地址赋值给第二个对象
        Student s2 = s1;
        s2.name = "Sylvia";
        s2.age = 17;
        System.out.println("-------");
        System.out.println("s1的姓名是和年龄是："+s1.name+","+s1.age);
        System.out.println("s2的姓名是和年龄是："+s2.name+","+s2.age);
    }

}
