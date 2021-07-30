package week2.集合进阶.Set;

import java.util.HashSet;
/*
HashSet集合特点：
  1、底层数据结构是哈希表
  2、对集合迭代顺序不作任何保证，也就是说不保证存储和取出的元素顺序一致
  3、没有带索引的方法---不能使用普通for循环
  4、由于是Set集合，所以不包含重复元素的集合
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hs = new HashSet<String>();

        //添加元素
        hs.add("hello");
        hs.add("Monica");
        hs.add("Friends Actress");

        System.out.println("hello".hashCode());

        //traversal
        for (String s:hs) {
            System.out.println(s);
        }
    }
}
