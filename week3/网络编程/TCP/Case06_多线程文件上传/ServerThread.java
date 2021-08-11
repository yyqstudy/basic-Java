package week3.网络编程.TCP.Case06_多线程文件上传;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable{
    private Socket s;
    public ServerThread(Socket s){
        this.s = s;
    }

    @Override
    public void run(){
        //接收数据写到文本文件
        try {
            //读取数据
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //写数据
            //BufferedWriter bw = new BufferedWriter(new FileWriter("./week3/网络编程/TCP/Case06_多线程文件上传/copy.txt"));
            //解决名称冲突问题--重名
            int count = 0;
            File file = new File("./week3/网络编程/TCP/Case06_多线程文件上传/copy["+count+"].txt");
            while(file.exists()){
                count++;
                file = new File("./week3/网络编程/TCP/Case06_多线程文件上传/copy["+count+"].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            String line;
            while((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //给出反馈
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();

            //释放资源
            s.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
