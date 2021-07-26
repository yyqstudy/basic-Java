package week2.static静态;
/*
测试类
 */
public class StaticTest {
    public static void main(String[] args) {
        //创建对象
        UniversityStudent.university = "Yale";

        UniversityStudent us1 = new UniversityStudent();
        us1.name = "yyq";
        us1.age = 27;
        //us1.university = "Yale";//一旦用了static修饰，就不用这种对象名访问方法，而用类名访问 UniversityStudent.university = "Yale";
        us1.show();

        UniversityStudent us2 = new UniversityStudent();
        us2.name = "XXXx";
        us2.age = 27;
        //us2.university = "Yale";
        us2.show();

    }
}
