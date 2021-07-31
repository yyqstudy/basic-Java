package week2.集合进阶.可变参数;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class VarargsDemo {
    public static void main(String[] args) {
        //public static<T> List<T> asList<T>:返回由指定数组支持的固定大小的列表
        //List<String> list = Arrays.asList("hello","world","hello","java");

        //list.add("javaee");//UnsupportedOperationException
        //list.remove("java");//UnsupportedOperationException
        //list.set(1,"javaee");
        //System.out.println(list);


        //public static<E> List<E> of<E……elements>:返回包含任意数量元素的不可变列表
        //JDk9以上才能用
        //List<String> list = List.of("hello","world","hello","java");
        //list.add("javaee");//UnsupportedOperationException
        //list.remove("java");//UnsupportedOperationException
        //list.set(1,"javaee");//UnsupportedOperationException
        //System.out.println(list);

        //public static<E> Set<E> of<E……elements>:返回包含任意数量元素的不可变集合
      /*  Set<String> set = Set.of("hello","world","hello","java");
        set.add("javaee");
        set.remove("world");
        System.out.println(set);
*/
    }
}
