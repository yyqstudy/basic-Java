package day1.String字符串;

import java.util.Scanner;

/*
 * 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 *
 * 分析：
 * 		A:键盘录入一个字符串数据--Scanner
 * 		B:要统计三种类型的字符个数--定义三个统计变量，初始化值都是0
 * 		C:遍历字符串，得到每一个字符
 * 		D:判断该字符属于哪种类型，然后对应类型的统计量+1
 * 			假如ch是一个字符，判断它是属于大写字母，小写字母，还是数字---直接判断该字符是否在对应范围即可--if语句
 * 			大写：ch>='A' && ch<='Z'
 * 			小写：ch>='a' && ch<='z'
 * 			数字：ch>='0' && ch<='9'
 * 		E:在循环外面输出结果

 */
public class case02StringCount {
    public static void main(String[] args) {
        //键盘录入一个字符串数据--Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String line = sc.nextLine();//对应for循环的line

        //要统计三种类型的字符个数--定义三个统计变量，初始化值都是0
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;

        //遍历字符串，得到每一个字符
        for(int i = 0; i<line.length();i++){
            char ch = line.charAt(i);//就是指定索引处的字符值

            //判断该字符属于哪种类型，然后对应类型的统计量+1
            if(ch>='A' && ch<='Z'){
                uppercaseCount++;
            }else if(ch>='a' && ch<='z'){
                lowercaseCount++;
            }else if(ch>='0' && ch<='9'){
                digitCount++;
            }
        }
        //在循环外面输出三种字符的结果
        System.out.println("大写字母："+uppercaseCount+"个");
        System.out.println("小写字母："+lowercaseCount+"个");
        System.out.println("数字："+digitCount+"个");


    }
}
