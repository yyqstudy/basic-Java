package week1.集合基础;

public class Student_Upgraded {
    private String name;
    private String age;
    //构造无参数
    public Student_Upgraded(){}
    //构造有参数
    public Student_Upgraded(String name, String age){
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
    public void setAge(String age){
        this.age = age;
    }
    //提供get方法
    public String getAge(){
        return age;
    }

}
