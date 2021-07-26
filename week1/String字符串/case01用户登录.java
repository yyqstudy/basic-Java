package week1.String字符串;

import java.util.Scanner;

/*
 * 要求：已知用户名与密码，模拟用户登录,给三次机会,并提示还有几次。
 *
 * 分析：
 * 		A:已知用户名与密码，定义两个字符串对象，用于存储已经存在的用户名和密码
 * 		B:键盘录入用户名和密码，用Scanner实现
 * 		C:拿键盘录入的用户名和密码和已经存在的用户名和密码进行比较，字符串内容比较用equals()实现
 * 			如果内容相同，提示登录成功
 * 			如果内容不同，提示登录失败，并提示还有几次机会
 * 	    D：用循环实现多次机会，这里的次数已知，采用for循环实现，并在登录成功时候，使用break结束循环
 *
 */
public class case01用户登录 {
    public static void main(String[] args) {
        //已知用户名与密码，定义两个字符串对象，用于存储已经存在的用户名和密码
        String username = "BeeBeatBear";
        String password ="beebeatbearisridious";

        //用循环实现多次机会，这里的次数已知，采用for循环实现，并在登录成功时候，使用break结束循环
        //for(int i = 0;i<3;i++){
        for(int i = 3;i>0;i--){
            //键盘录入用户名和密码，用Scanner实现
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名：");
            String name = sc.nextLine();

            System.out.println("请输入密码：");
            String pwd = sc.nextLine();

            //拿键盘录入的用户名和密码和已经存在的用户名和密码进行比较，字符串内容比较用equals()实现
            if(name.equals(username) && pwd.equals(password)){
                System.out.println("登录成功");
                break;
            }else{
                //用完3次机会后，锁定账号
                //if(2-i == 0){
                if(i-1 == 0){
                    System.out.println("你的账号被锁定，请与管理员联系");
                }else{
                    //还有几次机会：2,1,0
                    //i : 0,1,2
                    //System.out.println("登录失败，你还有"+(2-i)+"次机会");
                    System.out.println("登录失败，你还有"+(i-1)+"次机会");
                }

            }
        }


    }
}
