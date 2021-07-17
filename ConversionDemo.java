public class ConversionDemo {
    public static void main(String[] args) {
        //自动类型转换
        double d = 20;
        System.out.println(d);
        //定义byte类型的变量
        byte b = 10;
        short a = b;
        int i = b;
        //但是char c = b 这是错误的
        System.out.println(i);

        //强制类型转换
        int k =(int)88.88; //如果写成int k = 88.88会报错，因为double转换成int有问题
        System.out.println(i);

    }
}
//类型转换 自动类型转换：数据范围小的数值或者变量赋值给数据范围大大变量  强制类型转换：范围大大数值赋值给范围小的数值



