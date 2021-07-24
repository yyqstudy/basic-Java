package day1.集合基础;

import java.util.ArrayList;

/*
删除元素
    public boolean remove(Object o):删除指定的元素，返回删除是否成功
    public E remove(int index):删除指定索引处的元素，返回被删除的元素
修改元素
    public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
获取元素
    public E get(int index):返回指定索引处的元素
集合长度
 	public int size():返回集合中的元素的个数


 */
public class ArrayList删改查 {
    public static void main(String[] args) {
        //public ArrayList():创建一个空的集合对象
        ArrayList<String> array = new ArrayList<>();
        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        //output
        System.out.println("array:"+array);

        //***每次测试一个功能时候，注释掉其他类型功能

        /*删除
        //public boolean remove(Object o):删除指定的元素，返回删除是否成功
        System.out.println(array.remove("world"));//输出是true
        System.out.println(array.remove("redis"));//输出是false
        //output
        System.out.println("array:"+array);
        */

        /*
        //public E remove(int index):删除指定索引处的元素，返回被删除的元素
        System.out.println(array.remove(1));//删除索引1--world--输出也是world
        System.out.println(array.remove(1));//❌，索引越界
        System.out.println("array:"+array);
        */

        /*修改元素
        //public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
        System.out.println(array.set(1,"python"));//返回被修改的元素--world
        System.out.println("array:"+array);
        System.out.println(array.set(1,"python"));//❌，索引越界
        */

        /*获取元素
        //public E get(int index):返回指定索引处的元素
        System.out.println(array.get(0));
        //System.out.println(array.get(3));//❌，索引越界
        System.out.println("array:"+array);
         */


        //public int size():返回集合中的元素的个数
        System.out.println(array.size());
        System.out.println("array:"+array);
    }
}
