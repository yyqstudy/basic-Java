package week2.集合进阶.Set.TreeSet;

public class Grade {
    private String name;
    private int ChineseScore;
    private int MathScore;

    public Grade() {
    }

    public Grade(String name, int chineseScore, int mathScore) {
        this.name = name;
        ChineseScore = chineseScore;
        MathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseScore() {
        return ChineseScore;
    }

    public void setChineseScore(int chineseScore) {
        ChineseScore = chineseScore;
    }

    public int getMathScore() {
        return MathScore;
    }

    public void setMathScore(int mathScore) {
        MathScore = mathScore;
    }
    //定义一个总分方法
    public int getSum(){
        return ChineseScore+MathScore;
    }
}
