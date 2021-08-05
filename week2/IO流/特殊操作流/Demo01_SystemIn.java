package week2.IO流.特殊操作流;

import java.io.IOException;
import java.io.InputStream;

/*
public static final InputStream in:标准输入流---对应键盘输入
 */
public class Demo01_SystemIn {
    public static void main(String[] args) throws IOException {
        //public static final InputStream in:标准输入流---对应键盘输入
        InputStream is = System.in;

        int by;
        while((by=is.read())!= -1){
            System.out.println((char)by);
        }
    }
}
