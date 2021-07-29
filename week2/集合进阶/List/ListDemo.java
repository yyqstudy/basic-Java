package week2.集合进阶.List;
/*
list集合的特点
有序：存储和取出的元素顺序一样
可重复：存储的元素可以重复
 */

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("hello");
        list.add("java");


        //遍历--迭代器方式--方法一
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("----------------");

       //---------------------------------
        /*
        list集合特有的方法
        void add(int index, E element) :将元素添加到index索引位置上
        E get(int index) :根据index索引获取元素
        E remove(int index) :根据index索引删除元素,返回被删除的元素
        E set(int index, E element):将index索引位置的的元素修改成指定元素，返回的是被修改元素
         */

         list.add(1,"python");
        //list.add(11,"python");//IndexOutOfBoundsException,报错
        System.out.println(list);
        System.out.println("----------------");

        System.out.println(list.remove(1));
        //System.out.println(list.remove(11));//IndexOutOfBoundsException,报错
        System.out.println(list);
        System.out.println("----------------");

        System.out.println(list.set(1,"C++"));
        //System.out.println(list.set(11,"C++"));//IndexOutOfBoundsException,报错
        System.out.println(list);
        System.out.println("----------------");

        System.out.println(list.get(2));
        //System.out.println(list.get(11));//IndexOutOfBoundsException,报错
        System.out.println(list);
        System.out.println("----------------");

        //---------------------------------
        //遍历--方法二--for循环--list.size()
        for (int i = 0; i < list.size(); i++) {
            String ss = list.get(i);
            System.out.println(ss);
        }
    }
}
