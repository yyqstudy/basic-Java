package week2.集合进阶.Map;

import java.util.HashMap;
import java.util.Map;

/*
Interface Map<K,V> --- K:key , V：value
key映射value
没有重复的key，一个key只能最多对应一个value

创建Map集合对象
多态方式
具体的实现类HashMap
 */
public class MapDemo {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();
        //V put(K key, V value)---  key=value
        map.put("001","air");
        map.put("002","rose");
        map.put("003","boat");

        map.put("003","bike");//同一个key，会自动输出之后的value，之前的会删掉

        System.out.println(map);


    }
}
