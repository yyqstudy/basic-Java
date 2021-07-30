package week2.集合进阶.Set.TreeSet;

public class Actress implements Comparable<Actress>{
    private String name;
    private int age;

    public Actress() {
    }

    public Actress(String name, int age) {
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


    /*
    return 0 --表示两者是相同元素
    return 1（正数） --按照添加元素的顺序 输出的（升序）
    return -1（负数）--按照添加元素的顺序 倒着输出的（降序）
     */


    @Override
    public int compareTo(Actress a) {
        //return 0;
        //return 1;
        //return -1;
        //按照年龄从小到大排序
        //this -- a2, s-- a1
        int num = this.age - a.age;//升序
        //int num = a.age - this.age;//降序

        //次要条件：年龄相同时候，按照姓名的字母排序
        //string可以直接调用compareTo()，name在最上面定义成string类型
       int num2 = num == 0? this.name.compareTo(a.name) : num;
        return num2;

    }
}
