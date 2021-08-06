package week2.IO流.特殊操作流;

import java.util.Properties;
import java.util.Set;

/*
Properties作为集合特有的方法
Object setProperty(String key,String value):设置集合的key和value，都是string类型，底层调用Hashtable方法put()
String getProperty(String key):通过key搜索value
Set<String> stringPropertyNames()：返回不可修改的key的集合，其中key和value都是String类型
 */
public class Demo07_PropertiesMethod {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();

        //Object setProperty(String key,String value):设置集合的key和value，都是string类型，底层调用Hashtable方法put()
        prop.setProperty("001","Alice");
        /*
        源码分析
        setProperty()分析
        Object setProperty(String key, String value) {
            return put(key, value);
        put()分析
         Object put(Object key, Object value) {
            return map.put(key, value);
        通过这两个方法，把本来是object类型的转换成string类型的
        */
        prop.setProperty("002","Albert");
        System.out.println(prop);


        //--------------------
        //String getProperty(String key):通过key搜索value
        System.out.println(prop.getProperty("001"));

        //--------------------
        //Set<String> stringPropertyNames()：返回不可修改的key的集合，其中key和value都是String类型

        Set<String> names = prop.stringPropertyNames();
        for (String key: names) {
            //System.out.println(key);
           String value = prop.getProperty(key);
            System.out.println(key+","+value);
        }


    }
}
