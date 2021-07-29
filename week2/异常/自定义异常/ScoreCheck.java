package week2.异常.自定义异常;

public class ScoreCheck {
    public void checkScore(int score) throws ScoreException{
        if(score<0 || score >100){
            //throw new ScoreException();//这里的throw是没有加s的
            throw new ScoreException("你给的数据有误，分数应该在0～100之间");
        }else{
            System.out.println("分数正常");
        }
    }
}
