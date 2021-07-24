package day1.集合基础;
/*
学生类
 */
public class Student {
    private String name;
    private int age;
    //构造无参数
    public Student(){}
    //构造有参数
    public Student(String name, int age){
        this.name = name;
        this.age= age;
    }
    //提供set方法
    public void setName(String name){
        this.name = name;
    }
    //提供get方法
    public String getName(){
        return name;
    }
    //提供set方法
    public void setAge(int age){
        this.age = age;
    }
    //提供get方法
    public int getAge(){
        return age;
    }

}
