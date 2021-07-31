package week2.集合进阶.Map;

import java.util.HashMap;
import java.util.Map;

/*
Map集合基本功能
V put(K key, V value)：添加元素
V remove(Object key)：根据指定的key删除键值对
void clear()：清空Map集合中所有的键值对
boolean containsKey(Object key):判断Map集合中是否包含键为key的键值对
boolean containsValue(Object value):判断Map集合中是否包含值为value键值对
boolean isEmpty() : 判断集合是否为空
int size():返回Map中键值对的个数

 */
public class MapDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();

        //V put(K key, V value)：添加元素
        map.put("animal","cat");
        map.put("fruit","cherry");
        map.put("country","Switzerland");

        System.out.println(map);

        //V remove(Object key)：根据指定的key删除键值对
        System.out.println(map.remove("animal"));

        //void clear()：清空Map集合中所有的键值对
        map.clear();

        //boolean containsKey(Object key):判断Map集合中是否包含键为key的键值对
        System.out.println(map.containsKey("fruit"));

        //boolean isEmpty() : 判断集合是否为空
        System.out.println(map.isEmpty());

        //int size():返回Map中键值对的个数
        System.out.println(map.size());


    }


}
