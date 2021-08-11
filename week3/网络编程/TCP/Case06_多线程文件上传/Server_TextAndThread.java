package week3.网络编程.TCP.Case06_多线程文件上传;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
服务器：接收到的数据写入文本文件，给出反馈，代码用线程进行封装，为每一个客户端开启一个线程
 */
public class Server_TextAndThread {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象（ServerSocket）
        ServerSocket ss = new ServerSocket(10000);


        //为了体现服务器一直运行,不关闭---while(true)
        while (true){
            //监听客户端连接，返回一个Socket对象
            Socket s = ss.accept();

            //为每一个客户端开启一个线程
            //写一个类ServerThread，实现Runnable接口，把客户端socket传过去
            //socket类没有实现Runnable接口，所以要用一个类包装---由外部类实现接口
            new Thread(new ServerThread(s)).start();
        }

    }
}
