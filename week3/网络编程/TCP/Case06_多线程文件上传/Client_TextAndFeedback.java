package week3.网络编程.TCP.Case06_多线程文件上传;

import java.io.*;
import java.net.Socket;

public class Client_TextAndFeedback {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象（Socket）
        Socket s = new Socket("192.168.0.77",10000);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("./week3/网络编程/TCP/Case06_多线程文件上传/网络编程"));

        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line=br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //----------------
        //🌟🌟🌟
        /*//自定义结束标志--标志难以定义--因为文件如果出现标志，只copy标志前面的内容，丢失后面的内容
        bw.write("111");
        bw.newLine();
        bw.flush();
*/
        //public void shutdownOutput()
        s.shutdownOutput();
        //🌟🌟🌟
        //接收反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();//等待服务器给数据然后读取数据，两者不知道对方执行到哪一步
        System.out.println("服务器反馈："+data);

        //释放资源
        br.close();
        s.close();
    }
}
