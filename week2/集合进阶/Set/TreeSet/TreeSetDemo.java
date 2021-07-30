package week2.集合进阶.Set.TreeSet;
/*
TreeSet
集合特点：
  元素有序--不是存储和取出的顺序--是按照一定规则进行具体排序--取决于构造方法
  TreeSet():根据其元素的自然排序进行排序--从小到大--无参数构造
  TreeSet(Comparator comparator):根据指定的比较器进行排序---带参数构造

  无索引--不能用for i循环--而是用for each和迭代器循环
  由于是Set集合--不包含重复元素
 */
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        //<>里面要的是引用类型，而不是基本类型，所以是Integer，不是int
        TreeSet<Integer> ts = new TreeSet<Integer>();

        //添加元素
        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(20);
        ts.add(50);

        ts.add(30);

        //
        for (Integer i:ts
             ) {
            System.out.println(i);
        }

    }
}
