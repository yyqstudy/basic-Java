package week2.集合进阶.List;

import java.util.LinkedList;

/*
LinkedList特有功能：

LinkedList底层使用的是链表结构,因此增删快,查询相对ArrayList较慢
void addFirst(E e) :向链表的头部添加元素
void addLast(E e):向链表的尾部添加元素
E getFirst():获取链头的元素,不删除元素
E getLast():获取链尾的元素,不删除元素
E removeFirst():返回链头的元素并删除链头的元素
E removeLast():返回链尾的元素并删除链尾的元素
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //创建对象
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("hello");
        ll.add("world");
        ll.add("hello");
        System.out.println(ll);
        //
        ll.addFirst("javaee");
        ll.addLast("python");
        System.out.println(ll);
        //
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll);
        //
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll);

    }
}