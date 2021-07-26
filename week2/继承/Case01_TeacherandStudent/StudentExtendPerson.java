package week2.继承.Case01_TeacherandStudent;

public class StudentExtendPerson extends Person{
    public StudentExtendPerson(){}
    public StudentExtendPerson(String name,int age){
        super(name, age);

    }
    public void study(){
        System.out.println("好好刷题");
    }
}
