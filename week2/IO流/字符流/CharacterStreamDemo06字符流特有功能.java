package week2.IO流.字符流;

import java.io.*;
/*
字符流缓冲流特有功能
BufferedWriter：
 void newLine():写一行的行分隔符
BufferedReader:
 public String readLine():读一行代码，结果包含行的内容字符串，不包含终止字符，如果到结尾，则为null

 */
public class CharacterStreamDemo06字符流特有功能 {
    public static void main(String[] args) throws IOException {
        /*//创建字节缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/yyq/Desktop/newbw.txt"));

        //写数据
        for (int i = 0; i <3 ; i++) {
            bw.write("hello"+i);
            //bw.write("\r");
            bw.newLine();//作用等同于bw.write("\r");
            bw.flush();

        }
        //释放资源
        bw.close();*/

        //创建字节缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("/Users/yyq/Desktop/newbw.txt"));

        //--------------
        // public String readLine():读一行代码，结果包含行的内容字符串，不包含终止字符，如果到结尾，则为null
        /*//第一次读取数据
        String line = br.readLine();
        System.out.println(line);
        //第二次读取数据
        line = br.readLine();
        System.out.println(line);

        //再多读两次
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);*/

        //循环改进程序
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
