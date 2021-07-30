package week2.集合进阶.Set.TreeSet;
/*
存储对象并遍历，创建TreeSet集合使用带参构造方法
要求：按照年龄从小到大排序
     年龄相同时候，按照姓名的字母排序
 */
import java.util.Comparator;
import java.util.TreeSet;
/*
为了不混淆--一个采用Actress类，一个采用Customer类
一个在Actress类上实现implements Compare接口
一个是TreeSet方法中传递一个比较器Comparator接口
两者的规则定义一样
 */
public class TreeSet_ParaDemo {
    public static void main(String[] args) {
        //创建集合对象
        //new Comparator<Custom>(){} --- 匿名内部类
        TreeSet<Customer> ts = new TreeSet<Customer>(new Comparator<Customer>() {
            //下面写Comparator指定的规则
            @Override
            public int compare(Customer o1, Customer o2) {
                //按照年龄从小到大排序
                //年龄相同时候，按照姓名的字母排序
                //this.age-s.age  从小到大排序
                //s.age-this.age  从大到小排序
                //this -- o1 ; s--o2
                //o1.getName()--string--可以直接使用compareTo()
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0?o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });
        //创建customer对象
        Customer o1 = new Customer("Alice",19);
        Customer o2 = new Customer("Crandy",17);
        Customer o3 = new Customer("Phinex",20);
        Customer o4 = new Customer("David",15);

        Customer o5 = new Customer("Alain",15);
        Customer o6 = new Customer("Alain",15);

        //把customer添加到集合
        ts.add(o1);
        ts.add(o2);
        ts.add(o3);
        ts.add(o4);
        ts.add(o5);

        //遍历集合--for each
        for (Customer o:ts
             ) {
            System.out.println(o.getName()+","+o.getAge());

        }

    }
}

   /*
                三元运算符： 格式：关系表达式？表达式1：表达式2  范例： a>b ? a:b
                  首先计算关系表达式的值
                  如果值为true，运算结果就是表达式1；
                  如果值为false，运算结果就是表达式2；
                 */
