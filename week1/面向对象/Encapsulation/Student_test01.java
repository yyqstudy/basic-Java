package week1.面向对象.Encapsulation;

public class Student_test01 {
    //成员变量
    String name;
    //int age;
    //不同点**private**
    private int age;
    //提供set方法
    public void setAge(int a){
        //age = a;
        if(a<0 || a>120){
            System.out.println("wrong input");
        }else{
            age = a;
        }

    }
    //提供get方法
    public int getAge(){
        return age;
    }
    //成员方法
    public void show(){

        System.out.println(name+","+age);
    }

}
