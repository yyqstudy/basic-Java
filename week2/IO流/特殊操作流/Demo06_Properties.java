package week2.IO流.特殊操作流;

import java.util.Properties;
import java.util.Set;

public class Demo06_Properties {
    public static void main(String[] args) {
        //创建集合对象
        //Properties参数类型不能有泛型（比如String），类型是object
        // Properties<String,String> prop = new Properties<String,String> ();❌
        Properties prop = new Properties();

        //存储元素
        prop.put("001","Alice");
        prop.put("002","Albert");
        prop.put("003","Judy");

        //遍历集合---keySet()是Map中的方法
        Set<Object> keySet = prop.keySet();
        for (Object key:keySet) {
            Object value = prop.get(key);
            System.out.println(key+","+value);
        }

    }
}
