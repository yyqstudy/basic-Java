package week3.网络编程.TCP.Case02_客户端键盘录入;

import java.io.*;
import java.net.Socket;

/*
客户端：数据来自于键盘录入，直到输入数据是886，发送数据结束

⚠️
因为传递的是字符串这样的数据，所以可以包装成字符流
但是如果传输的是图片，则不能使用字符流
 */
public class Client_SystemIn {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象（Socket）
        Socket s = new Socket("192.168.0.77",10000);

        //数据来自于键盘录入，直到输入数据是886，发送数据结束
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流
        //想直接得到字符串而不是字节---要把字节流转换成字符流---之前用了BufferedReader，为了配套---使用BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line = br.readLine()) != null){
            if("886".equals(line)){
                break;
            }
            //获取输出流对象
            /*OutputStream os = s.getOutputStream();
            os.write(line.getBytes());*/
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
     s.close();
    }

}
