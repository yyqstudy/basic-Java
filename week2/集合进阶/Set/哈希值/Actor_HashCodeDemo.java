package week2.集合进阶.Set.哈希值;

import week2.集合进阶.Set.哈希值.Actor;

public class Actor_HashCodeDemo {
    public static void main(String[] args) {
        //create actor object
        Actor a1 = new Actor("Brad Pitt",30);

        //同一个对象调用hashCode()，返回的哈希值相同
        System.out.println(a1.hashCode());//1846274136
        System.out.println(a1.hashCode());//1846274136
        System.out.println("-----------");

        //默认情况，不同对象的哈希值不同；
        //override hashCode()方法，可以实现让不同对象的哈希值相同
        Actor a2 = new Actor("Brad Pitt",30);
        System.out.println(a2.hashCode());//1639705018,override之后1121822488

        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("-----------");

        //哈希值有范围，超出范围就只能重复使用
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395


    }
}
