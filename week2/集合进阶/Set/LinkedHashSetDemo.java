package week2.集合进阶.Set;
/*
LinkedHashSet集合特点
1、哈希表和链表实现Set接口---可预测的迭代次序
2、由链表保证元素有序---元素的取出和存储顺序一致
3、由哈希表保证元素唯一---没有重复元素
 */

import java.util.LinkedHashSet;

public class LinkedHashSetDemo<S> {
    public static void main(String[] args) {
        //创建集合对象
      LinkedHashSet<String> LinkedHashSet = new LinkedHashSet<String>();

        //添加元素
        LinkedHashSet.add("Alain");
        LinkedHashSet.add("famous actor");
        LinkedHashSet.add("Alain");

        //遍历集合
        for (String s:LinkedHashSet) {
            System.out.println(s);
        }

    }
}
