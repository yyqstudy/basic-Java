package week3.网络编程.UDP.Case_UDP通信;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
UDP接收数据：

因为接收端不知道发送端什么时候停止发送，采用死循环接收---注意循环括号里面有什么

UDP接收数据
1、创建接收端Socket对象（DatagramSocket）
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
public class Case_ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端Socket对象（DatagramSocket）
        DatagramSocket ds = new DatagramSocket(12345);

        //死循环接收
        while(true){
            //创建一个数据包，用于接收数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            //调用DatagramSocket对象的方法接收数据
            ds.receive(dp);

            //解析数据包，并把数据在console输出
            System.out.println("数据是："+ new String(dp.getData(),0,dp.getLength()));

        }

        //关闭接收端
        //ds.close();//因为采取死循环，一直接收数据，所以不用关闭接收端


    }
}
