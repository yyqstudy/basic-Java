package week2.集合进阶.Collection;
/*
定义学生类
 */
public class StudentClass {
    private String name;
    private int age;

    public StudentClass() {
    }

    public StudentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}