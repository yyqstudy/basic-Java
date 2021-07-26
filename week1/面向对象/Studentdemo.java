package week1.面向对象;

public class Studentdemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        System.out.println(s);
        //使用对象
        System.out.println(s.name+","+s.age);//这里是输出默认值
        s.name = "Albert";
        s.age = 18;
        System.out.println(s.name+","+s.age);
        //使用成员方法
        s.study();
        s.doHomework();

    }
}
