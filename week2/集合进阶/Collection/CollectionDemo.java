package week2.集合进阶.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
创建Collection集合对象
多态方式
具体实现类ArrayList
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<String> c = new ArrayList<String>();

        /*collection常用方法

        boolean add(Object e): 向集合中添加元素
        void clear():清空集合中所有元素
        boolean contains(Object o):判断集合中是否包含某个元素
        boolean isEmpty():判断集合中的元素是否为空
        boolean remove(Object o):根据元素的内容来删除某个元素
        int size():获取集合的长度
        Object[] toArray():能够将集合转换成数组并把集合中的元素存储到数组中*/

        //添加元素：boolean add(E e)
        c.add("hello");
        c.add("Java");

        //output
        //System.out.println(c.add("hello"));

        //---------------------------------

        //boolean remove(Object o):根据元素的内容来删除某个元素
        //System.out.println(c.remove("hello"));
        //System.out.println(c.remove("hello11112222"));

       //void clear():清空集合中所有元素
        //c.clear();
       // boolean contains(Object o):判断集合中是否包含某个元素
        //System.out.println(c.contains("Java"));


        //boolean isEmpty():判断集合中的元素是否为空
        //System.out.println(c.isEmpty());

        // int size():获取集合的长度
        //System.out.println(c.size());

        System.out.println(c);
        //-------------------------


        //Iterator<E> iterator():返回集合元素中的迭代器，通过集合iterator()方法
        //hasNext（）方法：判断集合中是否有元素可以迭代
        //next（）方法：用来返回迭代的下一个元素，并把指针向后移动一位。
        Iterator<String> it = c.iterator();//多态方式
        /*
        public Iterator<E> iterator() {
              return new Itr();
        }

        private class Itr implements Iterator<E> {}
         */
        if(it.hasNext()){
            System.out.println(it.next());
        }
        //---------------------------------
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());//NoSuchElementException:表示被请求的元素不存在

        //---------------------------------
        //用while循环改进
        while(it.hasNext()){
            //System.out.println(it.next());
            //常用以下格式
            String s = it.next();
            System.out.println(s);
        }

    }
}
