package week2.IO流.字符流.Case09至Case11;

public class StudentGrade {
    private String name;
    private int Chinese;
    private int Math;
    private int English;

    public StudentGrade() {
    }

    public StudentGrade(String name, int chinese, int math, int english) {
        this.name = name;
        Chinese = chinese;
        Math = math;
        English = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }
    public int getSum(){
        return Chinese+Math+English;
    }
}
