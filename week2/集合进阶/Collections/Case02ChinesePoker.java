package week2.集合进阶.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
要求：通过程序实现斗地主过程中的洗牌、发牌和看牌
思路：
1、创建一个牌盒---即定义一个集合对象--用ArrayList实现--数组的长度可变
2、往牌盒里面装牌--- add()
3、洗牌，也就是把牌打撒---Collections的shuffle()方法实现
4、发牌，也就是遍历集合，给三个玩家发牌---如何分牌---对3取余
5、看牌，也就是三个玩家分别遍历自己对牌---定义一个方法，然后调用
具体规则：
	1. 组装54张扑克牌
    2. 将54张牌顺序打乱
	3. 三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
	4. 查看三人各自手中的牌、底牌

 */
public class Case02ChinesePoker {
    public static void main(String[] args) {
        //创建一个牌盒
        ArrayList<String> array = new ArrayList<String>();
        //往牌盒里面装牌
        /*
        扑克牌种类
        ♦️2，♦️3、♦️4、♦️5...♦️K、♦️A
        ♣️2，♣️3、♣️4、♣️5...♣️K、♣️A
        ♠️2...
        ♥️2...
        大王、小王
         */
        //定义花色数组
        String []colors  = {"♦️","♥️","♠️","♣️"};
        //定义点数数组
        String [] numbers = {"2","3","4","5","6","7","8","9","10","J","K","A"};

        //case02的花色嵌套点数
        //每一个花色的所有点数拼接完了之后，再拼接下一个花色
        for(String color :colors){
            for(String num:numbers){
                array.add(color+num);//字符串拼接，用"+"
            }
        }
        array.add("Little Joker");
        array.add("Big Joker");

        //洗牌，也就是把牌打撒---Collections的shuffle()方法实现
        Collections.shuffle(array);

        //发牌，也就是遍历集合，给三个玩家发牌---如何分牌---对3取余
        //给三个玩家发牌---首先要创建三个玩家对象，让他们把牌存储起来

        //创建三个玩家对象
        ArrayList<String> No1array = new ArrayList<String>();
        ArrayList<String> No2array = new ArrayList<String>();
        ArrayList<String> No3array = new ArrayList<String>();
        ArrayList<String> Pocket = new ArrayList<String>(); //还要创建底牌对象

        for(int i=0;i< array.size();i++){
            String card = array.get(i);
            //底牌要留出最后三张
            if(i >= array.size()-3){
                Pocket.add(card);
                //如何分牌---对3取余
            }else if(i%3==0){
                No1array.add(card);
            }else if(i%3 == 1){
                No2array.add(card);
            }else if(i%3 == 2){
                No3array.add(card);
            }
        }

        //看牌，也就是三个玩家分别遍历自己对牌---定义一个方法，然后调用
        CheckCard("Alice",No1array);
        CheckCard("Albert",No2array);
        CheckCard("Isebella",No3array);


    }
    //定义一个看牌方法
    //ArrayList<String> array--一个牌盒
    public static void CheckCard (String name,ArrayList<String> array){
        System.out.print(name+"的牌是:");
        for (String card:array){
            System.out.print(card+" ");//每张牌用空格隔开
        }
        System.out.println();
    }
}
