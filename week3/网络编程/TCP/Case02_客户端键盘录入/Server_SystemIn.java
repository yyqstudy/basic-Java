package week3.网络编程.TCP.Case02_客户端键盘录入;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/*
服务器：接收到的数据在console输出

⚠️
因为传递的是字符串这样的数据，所以可以包装成字符流
但是如果传输的是图片，则不能使用字符流
*/
public class Server_SystemIn {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象（ServerSocket）
        ServerSocket ss = new ServerSocket(10000);

        //监听客户端连接，返回一个Socket对象
        Socket s = ss.accept();

        //获取输入流
      /*  InputStream is = s.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);//转换流
        BufferedReader br = new BufferedReader(isr);*/
        //以上三行写成一行代码
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        //释放资源
        ss.close();
    }
}
