package day1.BasicKnowledge_CaseStudy;
/*
花费100文钱购买100只鸡，分别买到的组合是？
公鸡：5/只  x
母鸡：3/只  y
小鸡：1/3只 z

分析：
组合购买
x+y+z =100；
5*x + 3*y +z/3 = 100;
单独只看一只鸡
0<=x<=20;  100/5=20
0<=y<=33;  100/3=33
0<=z<=100; 100*3=300但是由于只买一百只鸡，所以限制了

循环嵌套方式
why--为什么循环嵌套？是因为同时限制的条件原因吗？
思路：
1、第1层循环，用于表示公鸡的范围，初始化表达式的变量定义为x=0，判断条件是x<=20；
2、第2层循环，用于表示母鸡的范围，初始化表达式的变量定义为x=0，判断条件是x<=33；
3、这时候，表示小鸡的变量 z = 100-x-y
4、在第2层循环里面，判断表达式 z%3 == 0（保证小鸡是整数）和表达式5*x + 3*y +z/3 = 100是否同时成立
  如果成立，输出对应的先，用x,y,z的值
 */
public class 百钱百鸡 {
    public static void main(String[] args) {
        //第1层循环，用于表示公鸡的范围，初始化表达式的变量定义为x=0，判断条件是x<=20
        for(int x=0;x<=20;x++){
            //第2层循环，用于表示母鸡的范围，初始化表达式的变量定义为x=0，判断条件是x<=33；
            for(int y =0;y<=33; y++){
                //这时候，表示小鸡的变量 z = 100-x-y
                int z = 100-x-y;
                //在第2层循环里面，判断表达式 z%3 == 0（保证小鸡是整数）和表达式5*x + 3*y +z/3 == 100是否同时成立
                if(z%3 == 0 && 5*x + 3*y +z/3 == 100){
                    System.out.println(x+";"+y+";"+z+";");
                }
            }
        }
    }
}
