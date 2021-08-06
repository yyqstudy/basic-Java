package week2.IO流.特殊操作流.Demo05_对象序列化;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*
构造方法：
ObjectOutputStream(OutputStream out):创建一个写入指定的OutputStream 的ObjectOutputStream

序列对象化的方法：
void writeObject(Object obj):将指定的对象写入ObjectOutputStream

NotSerializableException：Thrown when an instance is required to have a Serializable interface.
                         The serialization runtime or the class of the instance can throw this exception

                         类的序列化由实现java.io.Serializable接口类启用，不实现此接口的类将不会使任何状态的序列化或反序列化
                         ----在Student中实现Serializable接口
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //ObjectOutputStream(OutputStream out):创建一个写入指定的OutputStream 的ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./week2/IO流/特殊操作流/Demo05_对象序列化/oos.txt"));

        //创建对象
        Student s = new Student("Alice",18);

        //void writeObject(Object obj):将指定的对象写入ObjectOutputStream
        oos.writeObject(s);

        //释放资源
        oos.close();



    }
}

//🌟🌟代码能运行，但是创建的oos.txt里面看不懂----需要反序列化----ObjectInputStream