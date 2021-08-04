
package week2.IO流.字节流ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo04Try_Catch {
    public static void main(String[] args) {

        //加入finally来实现释放资源
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("/Users/yyq/Desktop/bs4/fos.txt");
            fos.write("hello".getBytes());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            //空指针，即等于null
           if(fos != null){
               try {
                   fos.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }

        }
    }
}

