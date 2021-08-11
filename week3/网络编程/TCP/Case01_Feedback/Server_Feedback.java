package week3.网络编程.TCP.Case01_Feedback;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
服务器：接收数据，给出反馈
 */
public class Server_Feedback {
    public static void main(String[] args) throws IOException {
        //1、创建服务器端的Socket对象（ServerSocket）
        // 构造方法---ServerSocket(int port)
         ServerSocket ss = new ServerSocket(10000);

         //监听客户端连接，返回一个Socket对象
        Socket s = ss.accept();

        //获取输入流，读数据，并在console输出
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("服务器:"+data);

        //给出反馈--写数据
        OutputStream os = s.getOutputStream();
        os.write("数据已收到".getBytes());

        //释放资源
        ss.close();//s.close()写不写都可以，因为Socket由 ServerSocket监听连接得到的

    }
}
