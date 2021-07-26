package week2.继承.Case01_TeacherandStudent;

public class TeacherExtendPerson extends Person{
    public TeacherExtendPerson(){}
    public TeacherExtendPerson(String name, int age) {
       /* this.age =age;//报错，因为private权限设置，不能访问person中的name与age
        this.name =name;*/
        super(name, age);
    }

    public void teach(){
        System.out.println("早起教书");
    }
}
