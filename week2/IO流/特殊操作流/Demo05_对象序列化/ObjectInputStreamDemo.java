package week2.IO流.特殊操作流.Demo05_对象序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
/*
 构造方法：
    ObjectInputStream(InputStream in): 创建指定的InputStream读取的 ObjectInputStream

 反序列化对象的方法：
     Object readObject():从ObjectInputStream读取一个对象
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // ObjectInputStream(InputStream in): 创建指定的InputStream读取的 ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./week2/IO流/特殊操作流/Demo05_对象序列化/oos.txt"));

        // Object readObject():从ObjectInputStream读取一个对象
        Object obj = ois.readObject();

        //向下转型
        Student s = (Student) obj;
        System.out.println(s.getName()+","+s.getAge());

        ois.close();

    }
}
