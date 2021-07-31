package week2.集合进阶.Map.HashMap;

import java.util.HashMap;
import java.util.Set;

/*
要求：创建一个HashMap集合，key是学生对象Student（类型是student），value是address（String类型）
存储多个key-value，并遍历
保证key的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象
思路：
1、定义学生类---另一个Student.java
2、创建HashMap集合对象
3、创建学生对象
4、把学生添加到集合
5、遍历集合
6、在学生类中重写两个方法
  hashCode()
  equals()
 */
public class Case01HashMap {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<Student,String> hashMap = new HashMap<Student,String>();

        //创建学生键--key
        Student s1 = new Student("Alice",12);
        Student s2 = new Student("Judy",14);
        Student s3 = new Student("Albert",15);
        Student s4 = new Student("Taylor",17);

        Student s5 = new Student("Taylor",17);

        //添加学生--create key-value pairs
        hashMap.put(s1,"Canada");
        hashMap.put(s2,"Russia");
        hashMap.put(s3,"Switzerland");
        hashMap.put(s4,"New zealand");

        hashMap.put(s5,"USA");//保证元素的唯一性，需要重写hashCode()和equals()--在学生类重写

        //遍历
        //获取所有key的集合---keySet()--<Student>类型
        Set<Student> keySet = hashMap.keySet();
        //遍历key集合，获取到每一个key---for each()
        for(Student key:keySet){
            //根据key获取value---get(object key)
            String value = hashMap.get(key);
            System.out.println(key.getName()+","+key.getAge()+","+value);
        }



    }
}
