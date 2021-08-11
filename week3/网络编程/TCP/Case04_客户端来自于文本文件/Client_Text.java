package week3.网络编程.TCP.Case04_客户端来自于文本文件;

import java.io.*;
import java.net.Socket;

public class Client_Text {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象（Socket）
        Socket s = new Socket("192.168.0.77",10000);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("./week3/网络编程/TCP/Case04_客户端来自于文本文件/网络编程"));

        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line=br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        br.close();
        s.close();
    }
}
