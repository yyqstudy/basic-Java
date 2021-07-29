package week2.集合进阶.Set;

import java.util.HashSet;
import java.util.Set;

/*
Set集合特点
 不包含重复元素的集合
 没有带索引的方法---用不了普通for循环（for i循环）

HashSet：对集合的迭代顺序不作任何保证

要求：存储字符串并遍历
 */
public class SetDemo {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> set = new HashSet<String>();

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        //不包含重复元素的集合
        set.add("world");

        //遍历
        for (String s :set) {
            System.out.println(s);
        }
    }
}
