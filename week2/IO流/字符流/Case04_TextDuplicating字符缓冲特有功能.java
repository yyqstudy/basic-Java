package week2.IO流.字符流;

import java.io.*;

public class Case04_TextDuplicating字符缓冲特有功能 {
    public static void main(String[] args) throws IOException {
        // 1、根据数据源创建字节缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("/Users/yyq/Desktop/bs4/Scientist.java"));
        //2、根据目的地创建字节缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/yyq/Desktop/Scientist.java"));
        //3、读写数据，复制视频
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
        }
        //4、释放资源
        bw.close();
        br.close();
    }
}
