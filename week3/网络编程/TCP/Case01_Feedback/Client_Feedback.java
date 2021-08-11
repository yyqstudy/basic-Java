package week3.网络编程.TCP.Case01_Feedback;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
/*
客户端：发送数据，给出反馈
 */
public class Client_Feedback {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象（Socket）
        Socket s = new Socket("192.168.0.77",10000);

        //获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("请接收数据".getBytes());

        //接收服务器反馈---读数据
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("客户端："+data);

        //释放资源
        s.close();


    }
}
