package day1.面向对象.标准类;
/*
test
创建对象并为其成员变量赋值的两种方式：
  无参构造方法创建对象后使用setXxx()赋值
  使用带参构造方法直接创建带有属性值的对象
 */
public class ArtistDemo {
    public static void main(String[] args) {
        //无参构造方法创建对象后使用setXxx()赋值
        Artist aa = new Artist();
        aa.setName("Isabelle Yasmine Adjani");
        aa.setAge(39);
        aa.show();
        //使用带参构造方法直接创建带有属性值的对象
        Artist aa1 = new Artist("Isabelle Yasmine Adjani",39);
        aa1.show();
    }
}
