package week2.集合进阶.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
模拟斗地主的升级版--玩家拿到的牌进行排序（TreeSet）
引入HashMap
看牌时候，把index（key）拿到map集合中获得牌（value）----Map获取功能：V get(Object key):根据key获取value

要求：通过程序实现斗地主过程中的洗牌、发牌和看牌
     对牌进行排序

思路：
1、创建HashMap，key是编号，value是牌
2、创建ArrayList，存储编号
3、创建花色数组和点数数组
4、从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
5、洗牌（洗的是编号)---Collections的shuffle()方法实现
6、发牌（发的也是编号，为了保证编号是排序，创建TreeSet集合接收）
7、定义方法看牌（遍历TreeSet集合，获取编号，到HashMap集合找对应的牌）----get()
8、调用看牌方法


 array.get(i)和array[i]一样功能-----输出是索引对应的值
 但是在本案例中，array list存储的是牌的索引，所以遍历时候，索引的index是i，array.get(i)得到的是牌的索引，是array中的元素

 */
public class Case03ChinesePoker升级版 {
    public static void main(String[] args) {
        //创建HashMap，key是编号，value是牌
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        //创建ArrayList，存储编号--编号的类型是Integer
        ArrayList<Integer> arr = new ArrayList<Integer>();

        //创建花色数组和点数数组--🌟🌟🌟与case02不同的地方来了--⚠️点数数组中2在最后面
        String [] colors = {"♦️","♥️","♠️","♣️"};
        String [] numbers = {"3","4","5","6","7","8","9","10","J","K","A","2"};

        //从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        int index = 0;
        //点数嵌套花色---🌟🌟🌟与case02的花色嵌套点数不同
        //前面的点数和四个花色拼接完了之后，再到下一个点数----最终结果就是点数从小到大输出
        //点数"2"在"A"后面--因为斗地主中2的大小仅次于大王小王
        for (String num:numbers) {
            for(String color:colors){
                hm.put(index,color+num);//从0开始往HashMap里面存储编号(key)，并存储对应的牌(value)
                arr.add(index);//往ArrayList里面存储编号
                index++;
            }
        }
        hm.put(index,"Little Joker");
        arr.add(index);
        index++;
        hm.put(index,"Big Joker");
        arr.add(index);

        //洗牌（洗的是编号)---Collections的shuffle()方法实现
        Collections.shuffle(arr);

        //发牌（发的也是编号，为了保证编号是排序，创建TreeSet集合接收）

        //创建三个玩家对象
        TreeSet<Integer> No1array = new   TreeSet<Integer>();
        TreeSet<Integer> No2array = new   TreeSet<Integer>();
        TreeSet<Integer> No3array = new   TreeSet<Integer>();
        TreeSet<Integer> Pocket   = new   TreeSet<Integer>(); //还要创建底牌对象

        for (int i = 0; i < arr.size(); i++) {
            //array list存储的是牌的索引，所以遍历时候，索引的index是i，array.get(i)得到的是牌的索引，是array中的元素
            int x = arr.get(i);//直接存i会降低code的可读性，得给注释
            if(i >= arr.size()-3){
                Pocket.add(x);
            //如何分牌---对3取余
            }else if(i%3==0){
              No1array.add(x);
            }else if(i%3 == 1){
              No2array.add(x);
            }else if(i%3 == 2){
              No3array.add(x);
            }
        }

        ///看牌，也就是三个玩家分别遍历自己对牌---定义一个方法，然后调用
         CheckCard("Alice",No1array,hm);
         CheckCard("Albert",No2array,hm);
         CheckCard("Isebella",No3array,hm);
        CheckCard("Pocket",No3array,hm);
    }

    //定义方法看牌（遍历TreeSet集合，获取编号，到HashMap集合找对应的牌）----get()
    //姓名--每个人拿到的编号key,key存储在Treeset--key要得到value，需要在hashmap里面找
    public static void CheckCard(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.print(name+"的牌是:");
        for(Integer key:ts){
            String poker = hm.get(key);
            System.out.print(poker +" ");
        }
        System.out.println();
    }
}
