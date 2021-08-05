package week2.IO流.字符流;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
案例：点名器

要求：一个文件存储班级同学姓名，每一个姓名占一行，要求通过程序实现随机点名器

思路：
1、创建字符缓冲输入流对象
2、创建ArrayList集合对象
3、调用字符缓冲输入流对象的方法读数据
4、把读取到的字符串数据存储到集合中
5、释放资源
6、使用Random产生一个随机数，随机数的范围在[0,集合的长度）
7、把第6步产生的随机数作为索引到ArrayList集合中取值
8、把第7步得到的数据输出在console
 */
public class Case08_RollCall {
    public static void main(String[] args) throws IOException {
        //1、创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("./week2/IO流/字符流/name.txt"));

        //2、创建ArrayList集合对象
        ArrayList<String> arr = new ArrayList<String>();

        //3、调用字符缓冲输入流对象的方法读数据
        String line;
        while((line = br.readLine()) != null){
            //4、把读取到的字符串数据存储到集合中
            arr.add(line);
        }
        //5、释放资源
        br.close();

        //6、使用Random产生一个随机数，随机数的范围在[0,集合的长度）
        Random r = new Random();
        int index = r.nextInt(arr.size());

        //7、把第6步产生的随机数作为索引到ArrayList集合中取值
        String name = arr.get(index);

        //8、把第7步得到的数据输出在console
        System.out.println("The Lucky One is "+name);

    }
}
