package week2.final修饰符;
/*
测试类
 */
public class Test02 {
    public static void main(String[] args) {
        //final修饰基本变量
        final int age = 20;//下面那一行的age会报错
        //age =100;
        System.out.println(age);

        //final修饰引用类型变量
        final Student_Test02 st = new Student_Test02();//st是地址值，st.age是内容，地址不可变，内容可以变
        st.age = 100;//新添加的
        System.out.println(st.age);


    }
}
