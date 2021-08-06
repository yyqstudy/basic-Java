package week3.网络编程.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
TCP接收数据
1、创建服务器端的Socket对象（ServerSocket）
   ServerSocket(int port)
2、监听客户端连接，返回一个Socket对象
  Socket accept()
3、获取输入流，读数据，并把数据显示在console
  Socket中的InputStream getInputStream()
4、释放资源
   close()
 */
public class Server_ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //1、创建服务器端的Socket对象（ServerSocket）
        //构造方法---ServerSocket(int port)
        ServerSocket ss = new ServerSocket(10000);

        //2、获取输入流--字节输入流，读数据，并把数据显示在console
        //但是ServerSocket 没有直接获取InputStream的方法---所以要ServerSocket与Socket联系起来
        //Socket accept()---侦听连接到此套接字并接受它
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        //字节流读数据---两种方式：一次读一个字节--一次读一个字节数组
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("数据是；"+data);

        //3、释放资源
        s.close();
        ss.close();
    }
}
