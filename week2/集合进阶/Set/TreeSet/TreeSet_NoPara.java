package week2.集合进阶.Set.TreeSet;

import java.util.TreeSet;

/*

用了Actress.java

存储对象并遍历，创建TreeSet集合使用无参构造方法
要求：按照年龄从小到大排序
     年龄相同时候，按照姓名的字母排序
 */
public class TreeSet_NoPara {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Actress> ts = new TreeSet<Actress>();

        //创建演员对象
        Actress a1 = new Actress("Katharine Hepburn",30);
        Actress a2 = new Actress("Elizabeth Taylor",34);
        Actress a3 = new Actress("Marilyn Monroe",28);
        Actress a4 = new Actress("Grace Kelly",31);
        Actress a5 = new Actress("Joan Crawford",30);

        Actress a6 = new Actress("Joan Crawford",30);

        //添加到集合
        ts.add(a1);
        ts.add(a2);
        ts.add(a3);
        ts.add(a4);
        ts.add(a5);
        ts.add(a6);


        //遍历
        for(Actress a : ts){
            System.out.println(a.getName()+","+a.getAge());
        }

    }

}
