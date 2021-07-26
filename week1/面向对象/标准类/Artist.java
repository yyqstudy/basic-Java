package week1.面向对象.标准类;
/*
标准类制作
1、成员变量
 使用private修饰
2、构造方法
 提供一个无参数构造方法
 提供一个带多个参数的构造方法
3、成员方法
 提供每一个成员变量对应的setXxx(),getXxx()
 提供一个显示对象信息的show()
4、测试类
 创建对象并为其成员变量赋值的两种方式
 无参构造方法创建对象后使用setXxx()赋值
 使用带参构造方法直接创建带有属性值的对象
 */
public class Artist {
    //成员变量
    // 使用private修饰
    private String name;
    private int age;
    //构造方法
    //无参数构造
    public Artist(){}
    //带多个参数的构造方法
    public Artist(String name,int age){
        this.name = name; //用了this区分局部变量和成员变量
        this.age = age;
    }
    //成员方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name ;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(int age){
        return age ;
    }
    public void show(){
        System.out.println(name+","+age);
    }

}
