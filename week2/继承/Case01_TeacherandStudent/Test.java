package week2.继承.Case01_TeacherandStudent;

public class Test {
    public static void main(String[] args) {
        //创建教师类对象，进行测试
        //无参数构造
        Teacher t1 = new Teacher();
        t1.setName("Judy");
        t1.setAge(30);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        //带参数构造
        Teacher t2 =new Teacher("Julia",28);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();
    }
}
