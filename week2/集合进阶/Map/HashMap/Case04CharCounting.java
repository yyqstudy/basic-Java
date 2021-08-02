package week2.集合进阶.Map.HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
要求：
键盘录入一个字符串，要求统计字符串中每个字符串出现的次数
举例：键盘输入"aaabbbdfg"  输出：a(3)b(3)d(1)f(1)g(1)

分析：
1、我们可以把结果分成几个部分来看：a(3)b(3)d(1)f(1)g(1)
2、每一个部分可以看成：字符和字符对应的次数组成
3、这样的数据，我们可以通过HashMap集合来存储，key-字符，value-字符对应的次数
  注意：key-字符，类型是Character；value-字符对应的次数，类型是Integer

思路：
1、键盘录入一个字符串
2、创建HashMap集合，key-Character；value-Integer
3、遍历字符串，得到每一个字符---此时还没有将字符串的字符赋值给HashMap中的key---charAt(i) 函数 是获取字符串中i位置的字符
4、拿得到的每一个字符作为key，到HashMap中找对应到值，看其返回值
  如果返回值是null，说明该字符在HashMap集合中之前不存在，就把字符作为key，value设为 1
  如果返回值不是null，说明该字符在HashMap集合中之前存在，value++，重新存储key和value到HashMap中
5、遍历HashMap集合，得到key和value，按要求拼接-----StringBuilder
6、输出结果


HashMap<Character,Integer> hm = new HashMap<Character,Integer>();//输出无顺序
TreeMap<Character,Integer> hm = new TreeMap<Character,Integer>();//输出有顺序

 */
public class Case04CharCounting {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();


        //创建HashMap集合，key-Character；value-Integer
        //HashMap<Character,Integer> hm = new HashMap<Character,Integer>();//输出无顺序
        TreeMap<Character,Integer> hm = new TreeMap<Character,Integer>();//输出有顺序

        //遍历字符串，得到每一个字符
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);//将字符串的字符赋值给HashMap中的key

            //拿得到的每一个字符作为key，到HashMap中找对应到值，看其返回值
            Integer value = hm.get(key);

            if(value == null){
                //如果返回值是null，说明该字符在HashMap集合中之前不存在，就把字符作为key，value设为 1
                hm.put(key,1);
            }else{
                //如果返回值不是null，说明该字符在HashMap集合中之前存在，value++，重新存储key和value到HashMap中
                value++;
                hm.put(key,value);
            }
        }

        //遍历HashMap集合，得到相对应的key和value，按要求拼接
        //public StringBuilder append(任意类型):
        // 添加数据，并返回自身对象--为什么用StringBuilder--因为key是Character类型，value是Integer
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for (Character key:keySet
             ) {
            Integer value = hm.get(key);//相对应的key和value
            sb.append(key).append("(").append(value).append(")");//按要求拼接,但是输出要string形式
        }
        String result = sb.toString();
        //输出结果
        System.out.println(result);


    }
}
