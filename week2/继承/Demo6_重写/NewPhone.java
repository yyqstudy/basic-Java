package week2.继承.Demo6_重写;
/*
新手机
 */
public class NewPhone extends Phone {
    @Override//这个变红，证明方法重写有问题
    public void call(String name){
        System.out.println("开启视频功能");
        //System.out.println("给"+name+"打电话");
        super.call(name);
    }

}
