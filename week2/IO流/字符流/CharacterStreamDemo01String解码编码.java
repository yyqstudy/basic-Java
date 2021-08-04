package week2.IO流.字符流;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
编码
byte[] getBytes():平台默认字符集将该String编码，将结果存储在新的字节数组中
byte[] getBytes(String charsetName):指定的字符集将该String编码，将结果存储在新的字节数组中

解码
String(byte[] bytes):平台默认字符集解码指定的数组构造新的String
String(byte[] bytes, String charsetName):指定的字符集字符集解码指定的数组构造新的String
 */
public class CharacterStreamDemo01String解码编码 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //定义一个String
        String s ="中国";

        //🌟编码
        //byte[] getBytes():平台默认字符集将该String编码，将结果存储在新的字节数组中
        byte[] bys = s.getBytes();
        System.out.println(Arrays.toString(bys)); //[-28, -72, -83, -27, -101, -67]
        System.out.println("------------");

        //byte[] getBytes(String charsetName):指定的字符集将该String编码，将结果存储在新的字节数组中
        byte[] bys1 = s.getBytes("UTF-8");
        System.out.println(Arrays.toString(bys1));//[-28, -72, -83, -27, -101, -67]
        System.out.println("------------");

        byte[] bys2 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bys2));//[-42, -48, -71, -6]
        System.out.println("------------");

        //----------------
        //🌟解码
        //String(byte[] bytes):平台默认字符集解码指定的数组构造新的String
        String ss = new String(bys);
        System.out.println(ss);
        System.out.println("------------");

        //String(byte[] bytes, String charsetName):指定的字符集字符集解码指定的数组构造新的String
        String ss1 = new String(bys,"UTF-8");
        System.out.println(ss1);
        System.out.println("------------");

        String ss2 = new String(bys,"GBK");//bys默认平台的默认字符集，换成bys2可以输出 中国
        System.out.println(ss2);
    }
}
