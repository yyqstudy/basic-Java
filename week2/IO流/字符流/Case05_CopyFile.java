package week2.IO流.字符流;

import java.io.*;

public class Case05_CopyFile {


    public static void main(String[] args) {
        String source = "/Users/yyq/Desktop/bos.txt";
        copy(source, 1024);
    }

    public static void copy(String source, int bufferSize) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(new File(source));
            out = new FileOutputStream(new File("./week2/IO流/字符流/bos.text"));
            //一次读写一个字符数组
            byte[] buffer = new byte[bufferSize];
            int len;
            while((len = in.read(buffer)) != -1){
                out.write(buffer,0,len);
            }
            //4、释放资源
            in.close();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
