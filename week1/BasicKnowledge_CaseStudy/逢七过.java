package week1.BasicKnowledge_CaseStudy;
/*
逢7过
任意数字开始报数，当报的数字包含7或者是7的倍数时候，说："过"。
要求：console输出逢七过规则的数据
思路：
1、数据在1～100之间，用for循环实现数据获取（未知情况用while循环）
2、根据规则，用if语句实现数据的判断：要么个位是7；要么十位是7；要么被7整除
   分支语句讨论
  个位是7
  x%10 == 7;
  十位是7
  x/10%10 == 7;
  被7整除
  x%7 == 10
3、在console输出满足规则的数据

 */
public class 逢七过 {
    public static void main(String[] args) {
        for(int x=1; x<100;x++){
            if( x%10 == 7||x/10%10 == 7||x%7 == 10){
                //在console输出满足规则的数据
                System.out.println(x);
            }
        }
    }
}
