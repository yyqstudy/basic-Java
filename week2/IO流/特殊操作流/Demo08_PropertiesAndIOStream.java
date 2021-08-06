package week2.IO流.特殊操作流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
Properties和IO流结合的方法
void load(Reader reader):输入字符流读取key-value
void store(Writer writer,String comments):将key-value写入Properties表中
 */
public class Demo08_PropertiesAndIOStream {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
        myStore();//调用方法

        //把文件中的数据加载到集合中
        myLoad();
    }

    //---------------------------

    private static void myLoad() throws IOException {
        //创建集合
        Properties prop = new Properties();

        //void load(Reader reader):输入字符流读取key-value
        FileReader fr = new FileReader("./week2/IO流/特殊操作流/prop.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);

    }

    private static void myStore() throws IOException {
        //创建集合
        Properties prop = new Properties();

        prop.setProperty("001","Alice");//Object setProperty(String key,String value):设置集合的key和value，
        prop.setProperty("002","Albert");

        //void store(Writer writer,String comments):将key-value写入Properties表中
        //comments描述信息---不想描述--用null
        FileWriter fw = new FileWriter("./week2/IO流/特殊操作流/prop.txt");
        prop.store(fw,null);
        fw.close();
    }

}
