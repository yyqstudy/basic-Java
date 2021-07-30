package week2.集合进阶.Set.TreeSet;
/*
要求：编写一个程序，获取10个1～20之间的随机数，要求随机数不要重复，并在console
    输出
思路：
 1、创建Set集合对象---set不包含重复元素的集合
 2、创建随机数对象
 3、判断集合长度是不是小于10
     是，产生一个随机数，添加到集合；回到3继续---while循环，未知次数
 4、遍历

 */
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Case02_RandomNumber {
    public static void main(String[] args) {
        //创建Set集合对象
        //Set<Integer> set = new HashSet<Integer>();//HashSet 无顺序
        Set<Integer> set = new TreeSet<Integer>();//TreeSet 从小到大排列
        //创建随机数对象
        Random r = new Random();
        //判断集合的长度是不是小于10
        while(set.size()<10){
            //产生一个随机数，添加到集合
            int number = r.nextInt(20)+1;
            set.add(number);
        }

        //遍历集合
        for (Integer i:set
             ) {
            System.out.println(i);
        }
    }
}
