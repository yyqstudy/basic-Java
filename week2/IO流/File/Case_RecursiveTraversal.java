package week2.IO流.File;

import java.io.File;

/*
案例：遍历目录
要求：给定一个路径
     请通过递归完成遍历该目录下的所有内容，并把所有文件的绝对路径在console输出
思路：
   1、根据给定的路径创建一个File对象
   2、定义一个方法，用于获取给定目录下的所有内容，参数为第1步创建的File对象
   3、获取给定的File目录下所有的文件或者目录的File数组
   4、遍历该File数组，得到每一个File对象
   5、判断该File对象是否是目录
     --是，继续递归调用（调用的是定义的方法，也就是是方法调用一次在方法定义里面，一次在main()里面）
     --不是，获取绝对路径输出在console
   6、调用方法
 */
public class Case_RecursiveTraversal {
    public static void main(String[] args) {
        //1、根据给定的路径创建一个File对象
        File srcFile = new File("/Users/yyq/Desktop/bs4");
        //6、调用方法
        getAllFilePath(srcFile);
    }

    //2、定义一个方法，用于获取给定目录下的所有内容，参数为第1步创建的File对象
    public static void getAllFilePath(File srcFile){
        //3、获取给定的File目录下所有的文件或者目录的File数组
        File [] fileArray = srcFile.listFiles();
        //4、遍历该File数组，得到每一个File对象
        //为了程序的健壮性--在for each之前增加一个条件if(fileArray != null)
        if(fileArray != null){
            for(File file:fileArray){
                //5、判断该File对象是否是目录
                if(file.isDirectory()){
                    //是，继续递归调用（调用的是定义的方法，也就是是方法调用一次在方法定义里面，一次在main()里面）
                    getAllFilePath(file);
                }else{
                    //不是，获取绝对路径输出在console,这是所求的问题答案
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
