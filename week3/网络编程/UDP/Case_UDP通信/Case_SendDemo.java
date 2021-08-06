package week3.网络编程.UDP.Case_UDP通信;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
UDP发送数据

数据来自于键盘录入，直到输入的数据是886，发送数据结束


1、创建发送端Socket对象（DatagramSocket）
  DatagramSocket()---此类表示用来发送和接收数据,基于UDP协议的
2、创建数据并打包
  DatagramPacket(byte[] buf, int length, InetAddress address, int port)
3、调用DatagramSocket对象的方法发送数据
  void send(DatagramPacket p)
4、关闭发送端
  void close()
 */
public class Case_SendDemo {
    public static void main(String[] args) throws IOException {
        //1、创建发送端Socket对象（DatagramSocket）
        //  DatagramSocket()---此类表示用来发送和接收数据,基于UDP协议的
        DatagramSocket ds = new DatagramSocket();

        //自己封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            //输入的数据是886，发送数据结束
            if("886".equals(line)){
                break;
            }

            //创建数据并打包
            byte [] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.0.77"),12345);

            //调用DatagramSocket对象的方法发送数据
            ds.send(dp);

        }

        //关闭发送端
        ds.close();
    }
}
