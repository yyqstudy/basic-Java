package week2.异常.自定义异常;
//自定义异常
//extends Exception---非RuntimeException--需要throws ScoreException
public class ScoreException extends Exception{
    public ScoreException(){}
    public ScoreException(String message){
        super(message);
    }
}
