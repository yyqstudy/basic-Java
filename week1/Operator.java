package week1;

public class Operator {
    public static void main(String[] args) {
        //算术运算符
        int a = 6;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);//结果不是1.5 的原因是两个int相除只能得到int类型
        System.out.println(a % b);//结果是余数
        System.out.println("---------");//*****要打双引号
        System.out.println("字符'+'操作");//要使+不是作为运算的，直接就加引号

        //字符'+'
        int i = 10;
        char c = 'A';//字符A的值是65
        System.out.println(i + c);
        //类型会自动提升更高等级 byte,short,char -int- long-float-double
        //char ci = c + i;这是错的，因为自动提升到int类型
        int ci = c + i;
        System.out.println(ci);
        //int k = 10 + 13.14; 错的，自动提升到double
        double k = 10 + 13.14;
        System.out.println(k);
        System.out.println("---------");//*****要打双引号
        System.out.println("字符串'+'操作");

        //字符串'+' 从左到右执行
        System.out.println("Yale"+"MIT");
        System.out.println(2021+"MIT");
        System.out.println("---------");//*****要打双引号
        System.out.println("赋值'='操作");



        //赋值运算符 =
        int p = 10; //把10赋值给i
        System.out.println("p:"+p);
        p += 20; //i= i + 20 但是两者不等价，扩展运算符隐含类型转换
        System.out.println("p:"+p);



        


    }
}
