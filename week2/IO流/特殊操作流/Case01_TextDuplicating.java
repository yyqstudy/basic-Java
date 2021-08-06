package week2.IO流.特殊操作流;

import java.io.*;

/*
案例：复制Java文件---PrintWriter
1、根据数据源创建字符输入流对象
2、根据目的地创建字符输出流对象
3、读写数据，复制文件
4、释放资源
 */
public class Case01_TextDuplicating {
    public static void main(String[] args) throws IOException {

       /* 以前的做法
        BufferedReader br = new BufferedReader(new FileReader("/Users/yyq/Desktop/bs4/Scientist.java"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("./week2/IO流/特殊操作流/Scientist.java"));

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
        br.close();*/


        //--------------------------


        //根据数据源创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("/Users/yyq/Desktop/bs4/Scientist.java"));
       //根据目的地创建字符输出流对象
        PrintWriter pw = new PrintWriter(new FileWriter("./week2/IO流/特殊操作流/Scientist.java"),true);

        //读写数据，复制文件
        String line;
        while((line = br.readLine()) != null){
            pw.println(line);
        }
        //释放资源
        pw.close();
        br.close();
    }
}
