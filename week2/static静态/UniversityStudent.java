package week2.static静态;

public class UniversityStudent {
    public String name;
    public int age;
    //public String university;
    public static String university;//因为StaticTest两个学生的大学是一样，static可作为共享

    public void show(){
        System.out.println(name+","+age+","+university);
    }
}
