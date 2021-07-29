package week2.集合进阶.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
List集合常用子类：
ArrayList--底层数据结构--数组（查询快）
LinkedList--底层数据结构--链表（增删快）

分别使用ArrayList和LinkedList完成存储字符串并遍历（3种遍历方法）
 */
public class Case_ArraylistandLinkedlist_Traversal {
    public static void main(String[] args) {
        //创建ArrayList对象
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("java");

        //遍历
        for (String s:array) {
            System.out.println(s);
        }
        System.out.println("---------");
        for (int i = 0; i < array.size(); i++) {
            //String s = array.get(i);
            //System.out.println(s);
            System.out.println(array.get(i));
        }
        System.out.println("---------");
        Iterator<String> it = array.iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("---------");


        //------------------
        //创建LinkedList对象
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("python");
        //遍历
        for (String s:linkedList) {
            System.out.println(s);
        }

    }
}
