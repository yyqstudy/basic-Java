package week3.网络编程.TCP.Case03_服务器写入文本文件;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
服务器：接收到的数据写入文本文件
 */
public class Server_Text {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象（ServerSocket）
        ServerSocket ss = new ServerSocket(10000);

        //监听客户端连接，返回一个Socket对象
        Socket s = ss.accept();

        //接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //写入文本文件---FileWriter实现---FileWriter包装成BufferedWriter---对应BufferedReader
        //把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("./week3/网络编程/TCP/Case03_服务器写入文本文件/s.txt"));

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
        ss.close();
    }
}
