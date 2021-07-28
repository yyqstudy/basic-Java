package week2.常用API.Object应用;
/*
测试类
public boolean equals(Object obj),指示一些对象是否等于此
重写equals--command+N+I--equals()and has code()--默认IntelliJ IDEA--生成之后删除has code()

 */
public class Object_equals {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Olyvia");
        s1.setAge(20);

        Student s2 = new Student();
        s2.setName("Olyvia");
        s2.setAge(20);

        //要求：比较两个对象的内容是否相同
        System.out.println(s1.equals(s2));
        /*
         public boolean equals(Object obj) {
            //this-----s1
            //obj------s2
            return (this == obj);//现在还是比较地址值,要重写
          }
         */

    }
}
