package week1.数据输入;

public class case_comparing {
    public static void main(String[] args) {
        //比较两种老虎体重大小
        // 定义两只老虎的变量
        int weight1 = 180;
        int weight2 = 200;
        //三元运算符判断体重
        boolean b = weight1 == weight2 ? true:false;
        //输出结果
        System.out.println("b:" +b);


        /*三个和尚身高，求最高身高
        定义三个变量
        用三元运算符将先比较前两个和尚的身高，用临时身高变量保存起来
        用三元运算符将临时身高与第三个和尚比较，并用最大身高变量保存
        输出结果
         */
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        //用三元运算符将先比较前两个和尚的身高，用临时身高变量保存起来
        int tempheight = height1 > height2 ? height1 : height2;
        //用三元运算符将临时身高与第三个和尚比较，并用最大身高变量保存
        int maxheight = tempheight > height3 ? tempheight : height3;
        //output
        System.out.println("maxheight:" +maxheight);





    }
}
