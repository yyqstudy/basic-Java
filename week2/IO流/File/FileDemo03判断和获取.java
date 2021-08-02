package week2.IO流.File;

import java.io.File;

/*
boolean isDirectory():判断当前的目录是否存在
boolean isFile():判断当前路径是否是一个文件
boolean exists():判断指定路径的文件或文件夹是否存在
---------------
String getAbsolutePath():获取文件的绝对路径,返回路径的字符串
String getPath():获取File对象中封装的路径
String getName():获取文件或文件夹的名称
---------------
String[] list():以字符串数组的形式返回当前路径下所有的文件和文件夹的名称
File[] listFiles():以File对象的形式返回当前路径下所有的文件和文件夹的名称


 */
public class FileDemo03判断和获取 {
    public static void main(String[] args) {
        //创建一个File对象
        File f =new File("bs4/java.txt");

        /*判断功能
       boolean isDirectory():判断当前的目录是否存在
       boolean isFile():判断当前路径是否是一个文件
       boolean exists():判断指定路径的文件或文件夹是否存在
         */

        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());
        System.out.println("------------");
        /*
        String getAbsolutePath():获取文件的绝对路径,返回路径的字符串
        String getPath():获取File对象中封装的路径
        String getName():获取文件或文件夹的名称
         */
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("------------");

        /*
        String[] list():以字符串数组的形式返回当前路径下所有的文件和文件夹的名称
        File[] listFiles():以File对象的形式返回当前路径下所有的文件和文件夹的名称
         */
        //要创建另一个File对象--因为希望返回的是目录
        File f2 = new File("/Users/yyq/Desktop/bs4");
        String[] strArray = f2.list();
        for (String str: strArray
             ) {
            System.out.println(str);
        }
        System.out.println("------------");

        File[] fileArray = f2.listFiles();
        for (File file:fileArray
             ) {
            //System.out.println(file);
            //System.out.println(file.getName());//输出和上面的一样
            if(file.isFile()){
                System.out.println(file.getName());//只要文件，不要其他类型
            }
        }
    }
}
