package week2.IO流.字符流;

import java.io.*;

/*
案例：复制单级文件夹
要求：把/Users/yyq/Desktop/worldbank这个文件夹复制到模块目录下

思路：
数据源
1、创建数据源目录File----路径是/Users/yyq/Desktop/worldbank
2、获取数据源目录File的名称---worldbank
目的地
3、创建目的地目录File对象，路径名是模块名+worldbank组成--------"./week2/IO流/字符流/worldbank"
4、判断目的地是否已经存在File---如果不存在，就创建
数据源
5、获取数据源目录下所有文件的File数组
6、遍历File数组，得到每一个File对象，该File对象---数据源文件
  eg. /Users/yyq/Desktop/worldbank/wherehtml.png
7、获取数据源文件File对象的名称----wherehtml.png
目的地
8、创建目的地文件File对象，路径名是目的地目录+wherehtml.png组成----"./week2/IO流/字符流/worldbank/wherehtml.png"
9、复制文件---由于文件不仅是文本，还有图片视频-----采用字节流复制---BufferedInputStream和BufferedOutputStream

 */
public class Case12_FolderDuplicating {
    public static void main(String[] args) throws IOException {
        //1、创建数据源目录File----路径是/Users/yyq/Desktop/worldbank
        File srcFolder = new File("/Users/yyq/Desktop/worldbank");

        //2、获取数据源目录File的名称---worldbank
        String srcFolderName = srcFolder.getName();

        //3、创建目的地目录File对象，路径名是模块名+worldbank组成
        File destinationFolder = new File("./week2/IO流/字符流",srcFolderName);

        //4、判断目的地是否已经存在File---如果不存在，就创建
        /*
        boolean mkdir():当指定的单级文件夹不存在时创建File并返回true，否则返回false
        boolean exists():判断指定路径的文件或文件夹是否存在
         */
        if(!destinationFolder.exists()){
            destinationFolder.mkdir();
        }

        //5、获取数据源目录下所有文件的File数组
        //File[] listFiles():以File对象的形式返回当前路径下所有的文件和文件夹的名称
        File [] listFiles = srcFolder.listFiles();

        //6、遍历File数组，得到每一个File对象，该File对象---数据源文件
        for (File srcFile: listFiles) {
            //7、获取数据源文件File对象的名称----wherehtml.png
            String srcFileName = srcFile.getName();

            //8、创建目的地文件File对象，路径名是目的地目录+wherehtml.png组成
            File destinationFile = new File(destinationFolder,srcFileName);

            //9、调用复制文件方法
            copyFile(srcFile,destinationFile);
        }
    }

    //采用字节流复制
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
