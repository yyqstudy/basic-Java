package day1.面向对象.Encapsulation;
/*教师测试类
 */
public class Teacherdemo {
    public static void main(String[] args) {
        //创建对象
        Teacher t = new Teacher();
        //使用set方法给成员变量赋值
        t.setName("Rachel");
        t.setAge(24);

        t.show();
        //使用get方法获取成员变量的值
        System.out.println(t.getName()+"--"+t.getAge());
    }
}
