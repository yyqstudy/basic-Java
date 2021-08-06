package week3.网络编程.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

/*
UDP发送数据
1、创建发送端Socket对象（DatagramSocket）
  DatagramSocket()--此类表示用来发送和接收数据,基于UDP协议的

2、创建数据并打包
  DatagramPacket(byte[] buf, int length, InetAddress address, int port)
  DatagramPacket :此类表示数据报包
		  数据 byte[]
		  设备的地址 ip
		  进程的地址  端口号

3、调用DatagramSocket对象的方法发送数据
  void send(DatagramPacket p)
4、关闭发送端
  void close()
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
       //1、创建发送端Socket对象（DatagramSocket）
       // DatagramSocket()构造数据报套接字并将其绑定在本地主机上的任何可用端口
        DatagramSocket ds = new DatagramSocket();

        /*
        2、创建数据并打包
       DatagramPacket(byte[] buf, int length, InetAddress address, int port)

         */
        byte[] bys = "hello udp".getBytes();//数据转成字节数组
        int length = bys.length;
        InetAddress address = InetAddress.getByName("192.168.0.77");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys, length, address, port);
        //一行代码
        //DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.0.77"), 10086);

        //3、调用DatagramSocket对象的方法发送数据
        //  void send(DatagramPacket p)
        ds.send(dp);

        //4、关闭发送端
        //  void close()
        ds.close();

    }
}
