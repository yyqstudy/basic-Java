package week3.网络编程.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/*
UDP接收数据
1、创建发送端Socket对象（DatagramSocket）
   DatagramSocket(int port)
2、创建一个数据包，用于接收数据
   DatagramPacket(byte[] buf, int length)
3、调用DatagramSocket对象的方法接收数据
   void receive(DatagramPacket p)
4、解析数据包，并把数据在console输出
   byte[] getData()
   int getLength()
5、关闭接收端
   void close()
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //1、创建发送端Socket对象（DatagramSocket）
        //   DatagramSocket(int port)
        DatagramSocket ds = new DatagramSocket(10086);

        //2、创建一个数据包，用于接收数据
        //   DatagramPacket(byte[] buf, int length)构造一个DatagramPacket用于接收长度为length数据包
        byte[] bys = new byte[1024]; //🌟这个字节数组是我们定义的
        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        //3、调用DatagramSocket对象的方法接收数据
        ds.receive(dp);

        //4、解析数据包，并把数据在console输出
        //   byte[] getData()---返回数据缓冲区
        //🌟这个字节数组是我们得到的数据
        byte[] data = dp.getData();
        //   int getLength()---返回实际发送端发送的长度
        int len = dp.getLength();
        String dataString = new String(data,0,len);
        System.out.println("数据是"+dataString);

        //一行代码写完
        //System.out.println("数据是"+new String(dp.getData(),0,dp.getLength()));



        //关闭接收端
        ds.close();

    }
}
