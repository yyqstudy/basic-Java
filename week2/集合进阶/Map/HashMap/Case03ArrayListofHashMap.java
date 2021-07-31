package week2.集合进阶.Map.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
ArrayList集合存储HashMap元素并遍历
创建一个HashMap集合，存储三个key-value pairs元素，
每一个key-value pairs元素的key是String，value是ArrayList，
每一个ArrayList的元素都是String并遍历
思路：
1、创建HashMap集合
2、创建ArrayList集合，并添加元素
3、把ArrayList作为value元素添加到HashMap集合
4、遍历HashMap集合

给出如下的数据：
第一个ArrayList集合的元素：（Animal）
cat
sheep
第二个ArrayList集合的元素：（Film）
Gone with the wind
The Phantom Of the Opera
第三个ArrayList集合的元素：(MovieStar)
Elizabeth Taylor
 Brad Pitt

 */
public class Case03ArrayListofHashMap {
    public static void main(String[] args) {
       //创建HashMap集合--key是String，value是ArrayList---每一个ArrayList的元素都是String
        HashMap<String,ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
        //创建ArrayList集合，并添加元素
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("cat");
        arr1.add("sheep");
        //把ArrayList作为value元素添加到HashMap集合---V put(K key, V value)：添加元素
        hm.put("Animal",arr1);

        //创建ArrayList集合，并添加元素
        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("Gone with the wind");
        arr2.add("The Phantom Of the Opera");
        //把ArrayList作为value元素添加到HashMap集合---V put(K key, V value)：添加元素
        hm.put("Film",arr2);

        //创建ArrayList集合，并添加元素
        ArrayList<String> arr3 = new ArrayList<String>();
        arr3.add("Elizabeth Taylor");
        arr3.add(" Brad Pitt");
        //把ArrayList作为value元素添加到HashMap集合---V put(K key, V value)：添加元素
        hm.put("MovieStar",arr3);

        //遍历HashMap集合
        Set<String> keySet = hm.keySet();
        for(String key:keySet) {
            System.out.println(key);
            //value类型是ArrayList---每一个ArrayList的元素都是String
            ArrayList<String> value = hm.get(key);
            //遍历ArrayList集合
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }
    }
}
