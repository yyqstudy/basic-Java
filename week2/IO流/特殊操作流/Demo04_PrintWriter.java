package week2.IO流.特殊操作流;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/*
PrintWriter(String fileName):使用指定的文件名创建一个新的PrintWriter，而不需要自动执行刷新
PrintWriter(Writer out, boolean autoFlush):创建一个新的PrintWriter
                                           out:字符输出流
                                           autoFlush：一个布尔值，如果为真，则println,printf或者format方法将刷新输出缓冲区
 ⚠️字符流写数据并不能直接写到文本里面---要通过字节流---如何写入文件---flush()
 */
public class Demo04_PrintWriter {
    public static void main(String[] args) throws IOException {

        //PrintWriter(String fileName):使用指定的文件名创建一个新的PrintWriter，而不需要自动执行刷新
        PrintWriter pw = new PrintWriter("./week2/IO流/特殊操作流/pw.txt");

        pw.write("hello");
        pw.write("\r");
        //⚠️字符流写数据并不能直接写到文本里面---要通过字节流---如何写入文件---flush()
        pw.flush();
        /*pw.write("world");
        pw.write("\r");*/
        pw.println("world");//相当于做了pw.write("world")+ pw.write("\r")
        pw.flush();


        //----------------------------
        //PrintWriter(Writer out, boolean autoFlush):创建一个新的PrintWriter
        PrintWriter pw1 = new PrintWriter(new FileWriter("./week2/IO流/特殊操作流/pw1.txt"),true);
        pw1.println("hello");
    }
}
