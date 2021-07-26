package week1.集合基础;

import java.util.ArrayList;

/*
构造方法：
  		public ArrayList():创建一个空的集合对象

添加元素：
 		public boolean add(E e):添加元素到集合末尾
		public void add(int index,E element):在指定的索引处添加一个元素

 */
public class ArrayList构造与添加 {
    public static void main(String[] args) {
        //public ArrayList():创建一个空的集合对象
        ArrayList<String> array = new ArrayList<>();
        //output
        System.out.println("array:"+array);

        //添加元素

        //public boolean add(E e):添加元素到集合末尾
        //System.out.println(array.add("hello"));
        array.add("hello");
        array.add("world");
        array.add("java");
        System.out.println("array:"+array);

        //public void add(int index,E element):在指定的索引处添加一个元素
        //array.add(1,"python");
        array.add(3,"python");
        //array.add(4,"python");//报错IndexOutOfBoundsException，因为本来index只有0，1，2
        System.out.println("array:"+array);
    }
}
