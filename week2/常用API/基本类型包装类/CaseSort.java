package week2.常用API.基本类型包装类;

import java.util.Arrays;

/*
要求：一个字符串："91 27 46 38 50"，请写出程序实现最终输出结果："21 38 46 50 91"
    string不能直接排序
思路：
1、定义一个string
2、把string的数组元素存在一个int类型的数组中
   （1）如何得到字符串中每一个数组数字---split分隔
     public String[] split(String regex)
     返回：字符数组

    (2)定义一个int数组，把String[]数组中的每一个元素存在int数组中****
     public static int parseInt(String s)
3、对int数组进行排序
4、把排序后的int数组中的元素进行拼接得到一个字符串----StringBuilder
5、输出结果
 */
public class CaseSort {
    public static void main(String[] args) {
        //定义一个string
        String s = "91 27 46 38 50";

        //把string的数组元素存在一个int类型的数组中
        String[] strArray = s.split(" ");
        //检查：遍历，strArray有没有数据
        for (int i = 0; i <strArray.length ; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("--------------------");

        //定义一个int数组，把String[]数组中的每一个元素存在int数组中
        int[] arr = new int[strArray.length];
        for (int i = 0; i <arr.length ; i++) {
            //把String[]数组中的每一个元素存在int数组中
            arr[i] = Integer.parseInt(strArray[i]);
        }
        ////检查：遍历，arr有没有数据
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //3、对int数组进行排序--Arrays.sort()
        Arrays.sort(arr);

        //4、把排序后的int数组中的元素进行拼接得到一个字符串----StringBuilder
        StringBuilder sb =new StringBuilder();

        for (int i = 0; i <arr.length ; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        //得到的是StringBuilder类型，我们需要string类型---toString()
        String result = sb.toString();

        //5、输出结果
        System.out.println("result:"+result );


    }
}
