package week2.继承.Demo2_variable;

public class Son_variable extends Father_variable {
    //身高
    public int height = 175;
    //年龄
    //public int age = 20;
    public void show(){
        int age = 30;
        System.out.println(age);
        System.out.println(height);
        //System.out.println(weight);//报错
    }
}
