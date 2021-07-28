package week2.接口Interface.Case02Coach_Athlete;
/*
测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建对象--无参数构造
        TableTennisPlayer ttp = new TableTennisPlayer();
        ttp.setName("马龙");
        ttp.setAge(30);
        System.out.println(ttp.getName()+","+ttp.getAge());
        ttp.eat();
        ttp.study();
        ttp.speak();

        BasketballPlayer bbp = new BasketballPlayer();
        bbp.setName("姚明");
        bbp.setAge(30);
        System.out.println(bbp.getName()+","+bbp.getAge());
        bbp.eat();
        bbp.study();
        //bbp.speak();//报错
    }
}
