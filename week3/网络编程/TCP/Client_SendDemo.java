package week3.网络编程.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
TCP发送数据
1、创建客户端的Socket对象（Socket）
2、获取输出流，写数据
3、释放资源
 */
public class Client_SendDemo {
    public static void main(String[] args) throws IOException {
        //1、创建客户端的Socket对象（Socket）

        /*构造方法（连接到主机（IP地址）的端口两种方法）：
        Socket(InetAddress address,int port)
        Socket(String host,int port)
        */
        //Socket s = new Socket(InetAddress.getByName("192.168.0.77"),10000);
        Socket s = new Socket("192.168.0.77",10000);


        //2、获取输出流，写数据---网络传送的数据，各种各样都有---要用字节流--字节输出流--OutputStream
        //OutputStream getOutputStream()---返回输出流
        OutputStream os = s.getOutputStream();
        os.write("Hello,TCP".getBytes());

        //3、释放资源
        s.close();



    }
}
