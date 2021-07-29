package week2.集合进阶.增强For循环;
/*
格式：
for(元素的数据类型  变量 : Collection集合or数组){
       //变量
}

范例：

int[] arr = {1,2,3,4};
for(int i: arr){
   System.out.println(i);
}
 */
import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        for (int i:arr) {
            System.out.println(i);
        }
        System.out.println("-----------");

        String[] strArray = {"hello","world","java"};
        for(String s : strArray){
            System.out.println(s);
        }
        System.out.println("-----------");

        List<String> list = new ArrayList<String>();
        list.add("alice");
        list.add("welcome to Yale");
        for (String s:list
             ) {
            System.out.println(s);
        }
        System.out.println("-----------");
        //报错--并发处理异常
        /*for (String s:list) {
            if(s.equals("alice")){
                list.add("albert");
            }
*/

    }
}
