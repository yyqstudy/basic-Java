package week2.集合进阶.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map获取功能：

V get(Object key):根据key获取value
Set<K> keySet():获取所有key的集合
Collection<V> values():获取所有value的集合
Set<Map.Entry<K,V>> entrySet()：获取所有key-value pairs
 */
public class Map_获取功能 {
    public static void main(String[] args) {
        //
        Map<String,String> map = new HashMap<String,String>();
        //V put(K key, V value)：添加元素
        map.put("animal","cat");
        map.put("fruit","cherry");
        map.put("country","Switzerland");

        //V get(Object key):根据key获取value
        //System.out.println(map.get("animal"));

        //Set<K> keySet():获取所有key的集合set
        Set<String> keySet = map.keySet();
        for(String key:keySet){
            System.out.println(key);
        }
        System.out.println("------------------");


        //Collection<V> values():获取所有value的集合
        Collection<String> values = map.values();
        for(String value:values){
            System.out.println(value);
        }

        System.out.println("------------------");


    }
}
