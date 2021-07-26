package week1.Debug;
/*
debug调试，又称为断点调试，断点其实是一个标记，告诉从哪里开始查看
debug操作流程：
1、如何加断点
2、如何运行加了断点的程序
3、看哪里
4、点哪里
5、如何删除断点
 */
public class Debug {
    public static void main(String[] args) {
        //定义两个变量
        int i =19;
        int j= 20;
        //求和
        int sum = i + j;
        //输出结果
        System.out.println("sum:"+sum);
    }
}
