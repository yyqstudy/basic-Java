package week1.集合基础;

import java.util.ArrayList;

//****what--Java中判断类型的用哪种方法
/*
集合的遍历思想和数组的遍历思想相同
循环遍历容器,依次取出里面的元素即可

要求：创建一个存储字符串的集合，存储3个字符串元素，程序实现console输出
思路：
1、创建集合对象
2、往集合中添加字符串对象
3、遍历集合
     首先获取集合每一个元素---get(int index)实现
     然后获取集合长度---size()--类同于length()
     通用格式
     for(int i =0;i<=集合对象.size();i++){
          集合对象.get(i)//指定索引处的元素
     }
 */
public class ArrayList_Traversing {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<>();
        //往集合中添加字符串对象
        array.add("Rachel");
        array.add("Monica");
        array.add("Phoebe");
        array.add("Ross");
        array.add("Chandler");
        array.add("Joey");
        //遍历集合
        // 首先获取集合每一个元素---get(int index)实现--for循环改进

        /*
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));
         */

        for (int i = 0; i < array.size(); i++) {
            //System.out.println(array.get(i));
            //为什么要转string
            String s = array.get(i);
            System.out.println(s);
        }

    }
}
