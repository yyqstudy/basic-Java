package week2.IO流.字符流;

import java.io.*;

/*
案例：复制多级文件夹---使用递归
要求：要求：把/Users/yyq/Desktop/IBM课程10这个文件夹复制到模块目录下

思路：
1、创建数据源目录Folder---路径是"/Users/yyq/Desktop/IBM课程10"
2、创建目的地Folder对象---路径是"./week2/IO流/字符流/IBM课程10"
3、定义一个方法---实现文件夹复制---参数：数据源Folder对象和目的地Folder对象---返回值：
4、判断数据源Folder是否是目录---boolean isDirectory():判断是否是目录
   是：
    A：在目的地下创建和数据源Folder名称一样的目录
    B：获取数据源Folder下所有文件或者目录File数组
    C：遍历该File数组，得到每一个File对象
    D：把该File作为数据源File对象---递归--调用复制文件夹方法
   不是：
   说明是文件，直接复制---用字节流复制---参考Case12

 */
public class Case13_MultiFolderDuplicating {
    public static void main(String[] args) throws IOException {
        //1、创建数据源目录Folder---路径是"/Users/yyq/Desktop/IBM课程10"
        File srcFolder = new File("/Users/yyq/Desktop/IBM课程10");
        //2、创建目的地Folder对象---路径是"./week2/IO流/字符流/IBM课程10"
        File destinationFolder = new File("./week2/IO流/字符流");
        /*
        ⚠️之前写成"./week2/IO流/字符流/IBM课程10"会出错，而写成./week2/IO流/字符流没问题，
        ⚠️因为它创建文件夹和文件不同，文件夹要在已经存在的东西下面创建，而字符流那个package下面根本没有IBM课程10，所以报错
         */
        //🌟🌟🌟封装了数据源目录对象和目的地目录对象
        //调用方法---实现文件夹复制
        copyFolder(srcFolder,destinationFolder);
    }

    //复制多级文件夹
    private static void copyFolder(File srcFolder, File destinationFolder) throws IOException {
        //判断数据源Folder是否是目录---boolean isDirectory()
        if(srcFolder.isDirectory()){
            /*
            是：
             A：在目的地下创建和数据源Folder名称一样的目录
             B：获取数据源Folder下所有文件或者目录File数组
             C：遍历该Folder数组，得到每一个File对象
             D：把该File作为数据源Folder对象---递归--调用复制文件夹方法
             */
            String srcFolderName = srcFolder.getName();
            File newFolder = new File(destinationFolder,srcFolderName);//创建新的文件夹，使用目的地路径和要复制文件夹的名字
            if(!newFolder.exists()){
                newFolder.mkdir();
            }
            //B：获取数据源Folder下所有文件或者目录File数组
            File [] fileArray = srcFolder.listFiles();

              //C：遍历该File数组，得到每一个File对象
              for(File file:fileArray){
                //D：把该File作为数据源File对象---递归--调用复制文件夹方法
                copyFolder(file,newFolder);
            }

        }else{
            //不是：
            //说明是文件，直接复制---用字节流复制---参考Case12
            File newFile = new File(destinationFolder,srcFolder.getName());//封装---目的地目录+数据源文件名称组成
            copyFile(srcFolder,newFile);
        }
    }

    //采用字节流复制文件
    private static void copyFile(File srcFile, File destinationFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile));

        byte[] bys = new byte[1024];
        int len;
        while((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
}
