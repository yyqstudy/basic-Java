package week2.IO流.字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    复制文件的异常处理

try...catch...finally的做法：

     try{
       可能出现异常代码;
     }catch(异常类名 变量名){
       异常的处理代码;
     }finally{
       执行所有的清除操作
     }

JDK7改进方法：
     try(){
      可能出现异常代码;
     }catch(异常类名 变量名){
      异常的处理代码;
     }

JDK9改进方案：
      定义输入流对象；
      定义输出流对象；
      try(输入流对象;输出流对象){
            可能出现异常代码;
           }catch(异常类名 变量名){
            异常的处理代码;
           }
 */
public class CharacterStreamDemo07异常处理 {
    public static void main(String[] args) {

    }

    //------------------------
    //method1:抛出异常---throws IOException
    private static void method1() throws IOException{
        FileReader fr = new FileReader("./week2/IO流/字符流/name.txt");
        FileWriter fw = new FileWriter("./week2/IO流/字符流/fw.txt");

        char[] chs = new char[1024];
        int len;
        while((len = fr.read()) != -1){
            fw.write(chs,0,len);
        }
        fw.close();
        fr.close();
    }

    //------------------------
    //method2:try...catch...finally的做法
    private static void method2() {
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("./week2/IO流/字符流/name.txt");
            fw = new FileWriter("./week2/IO流/字符流/fw.txt");

            char[] chs = new char[1024];
            int len;
            while((len = fr.read()) != -1){
                fw.write(chs,0,len);
            }
        } catch( IOException e){
            e.printStackTrace();
        } finally {
            if(fw != null){
                try{
                    fw.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(fr != null){
                try{
                    fr.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }

        }
    }

    //------------------------
    //method3:JDK7改进方法：
    private static void method3() {
        try{FileReader fr = new FileReader("./week2/IO流/字符流/name.txt");
            FileWriter fw = new FileWriter("./week2/IO流/字符流/fw.txt");

            char[] chs = new char[1024];
            int len;
            while((len = fr.read()) != -1){
                fw.write(chs,0,len);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //------------------------
    //method4:JDK9改进方案
    private static void method4() throws IOException {
        FileReader fr = new FileReader("./week2/IO流/字符流/name.txt");
        FileWriter fw = new FileWriter("./week2/IO流/字符流/fw.txt");
        try (fr ; fw){
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
