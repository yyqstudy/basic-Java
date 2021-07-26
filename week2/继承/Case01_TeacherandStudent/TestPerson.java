package week2.继承.Case01_TeacherandStudent;

public class TestPerson {
    public static void main(String[] args) {


        //创建教师类对象
        //无参数构造
        TeacherExtendPerson tc1 = new TeacherExtendPerson();
        tc1.setName("Juddy");
        tc1.setAge(31);
        System.out.println(tc1.getName()+","+tc1.getAge());
        tc1.teach();

        //有参数构造
        TeacherExtendPerson tc2 =new TeacherExtendPerson("Sylvia",29);
        System.out.println(tc2.getName()+","+tc2.getAge());
        tc2.teach();


        //创建学生类对象
        //无参数构造
        StudentExtendPerson st1 = new StudentExtendPerson();
        st1.setName("Alice");
        st1.setAge(19);
        System.out.println(st1.getName()+","+st1.getAge());
        st1.study();

        //有参数构造
        StudentExtendPerson st2 =new StudentExtendPerson("Lyli",18);
        System.out.println(st2.getName()+","+st2.getAge());
        st2.study();
    }
}
