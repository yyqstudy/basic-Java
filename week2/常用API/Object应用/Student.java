package week2.常用API.Object应用;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
    //重写toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写equals--command+N+I--equals()and has code()--默认IntelliJ IDEA--生成之后删除has code()


    @Override
    public boolean equals(Object o) {
        /*
        this-----s1
        o------s2
         */
        //比较地址值是否相同，如果相同，返回true
        if (this == o) return true;
        //判断参数是否为null
        //判断这两个对象是否来自同一个class
        if (o == null || getClass() != o.getClass()) return false;

        //o------s2
        //向下转型，o转为Student类型，此时的student---s2
        Student student = (Student) o;

        //第一个age默认为 this.age，即s1.age与s2.age比较
        if (age != student.age) return false;

        //name默认为 this.name; student--s2
        //比较姓名内容是否相同
        return name != null ? name.equals(student.name) : student.name == null;
    }


}
