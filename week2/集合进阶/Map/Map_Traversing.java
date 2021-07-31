package week2.集合进阶.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
遍历Map集合操作：
1、获取所有key的集合---keySet()
2、遍历key集合，获取到每一个key---for each()
3、根据key获取value---get(object key)

方法二：
1、获取所有key-value pairs的集合---Set<Map.Entry<K,V>> entrySet()
2、遍历pairs的集合，得到每一个key-value pair---for each实现，得到每一个Map.Entry
3、根据key-value pairs获取key和value---getKey()和getValue()
 */
public class Map_Traversing {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();

        //V put(K key, V value)：添加元素
        map.put("animal","cat");
        map.put("fruit","cherry");
        map.put("country","Switzerland");

        //遍历
        //获取所有key的集合---keySet()
        Set<String> keySet = map.keySet();
        //遍历key集合，获取到每一个key---for each()
        for(String key:keySet){
            //根据key获取value---get(object key)
            String value = map.get(key);
            System.out.println(key+","+value);
        }

        System.out.println("----------");
        //方法二
        //获取所有key-value pairs的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历pairs的集合，得到每一个key-value pair
        //Map.Entry<String, String>相当于一个类型，如同String一样
        for(Map.Entry<String, String> ME:entrySet){
            //根据key-value pairs获取key和value
            String key = ME.getKey();
            String value = ME.getValue();
            System.out.println(key + ","+value);
        }


    }
}
