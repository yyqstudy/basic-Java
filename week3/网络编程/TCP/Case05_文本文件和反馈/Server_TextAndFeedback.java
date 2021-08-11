package week3.网络编程.TCP.Case05_文本文件和反馈;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
服务器：接收到的数据写入文本文件
 */
public class Server_TextAndFeedback {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象（ServerSocket）
        ServerSocket ss = new ServerSocket(10000);

        //监听客户端连接，返回一个Socket对象
        Socket s = ss.accept();

        //接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //写入文本文件---FileWriter实现---FileWriter包装成BufferedWriter---对应BufferedReader
        //把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("./week3/网络编程/TCP/Case05_文本文件和反馈/copy.txt"));

        String line;
        while((line = br.readLine()) != null){//等待客户端给数据然后读取数据，两者不知道对方执行到哪一步
            /*if("111".equals(line)){
                break;
            }*/
            bw.write(line);
            bw.newLine();
            bw.flush();
        }



        //🌟🌟🌟
        //给出反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();

        //释放资源
        bw.close();
        ss.close();
    }
}

