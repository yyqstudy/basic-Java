package week2.集合进阶.Map.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
ArrayList集合存储HashMap元素并遍历
创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap，每一个HashMap的key和value都是String，并遍历
思路：
1、创建ArrayList集合
2、创建HashMap集合，并添加key-value pairs元素
3、把HashMap作为元素添加到ArrayList集合
4、遍历ArrayList集合

给出如下的数据：
第一个HashMap集合的元素：
cat fish
sheep grass
第二个HashMap集合的元素：
movie  Gone with the wind
opera  The Phantom Of the Opera
第三个HashMap集合的元素：
actress  Elizabeth Taylor
actor    Brad Pitt

 */
public class Case02HashMapofArrayList {
    public static void main(String[] args) {
        //创建ArrayList集合--里面元素都是HashMap，每一个HashMap的key和value都是String--ArrayList<HashMap<String,String>>
        ArrayList<HashMap<String,String>> array = new ArrayList<HashMap<String,String>>();
        //创建HashMap集合，并添加key-value pairs元素
        HashMap<String,String> hm1 =new HashMap<String,String>();
        hm1.put("cat","fish");
        hm1.put("sheep","grass");
        //把HashMap作为元素添加到ArrayList集合
        array.add(hm1);

        //创建HashMap集合，并添加key-value pairs元素
        HashMap<String,String> hm2 =new HashMap<String,String>();
        hm1.put("movie","Gone with the wind");
        hm1.put("opera","The Phantom Of the Opera");
        //把HashMap作为元素添加到ArrayList集合
        array.add(hm2);

        //创建HashMap集合，并添加key-value pairs元素
        HashMap<String,String> hm3 =new HashMap<String,String>();
        hm1.put("actress","Elizabeth Taylor");
        hm1.put("actor","Brad Pitt");
        //把HashMap作为元素添加到ArrayList集合
        array.add(hm3);

        //遍历ArrayList集合
        for (HashMap<String,String> hm:array) {
            Set<String> keySet = hm.keySet();
            //遍历ArrayList集合里面的HashMap元素
            for(String key:keySet){
                String value = hm.get(key);
                System.out.println(key+","+value);
            }
        }



    }
}
