package week1.String字符串;
/*
拼接字符串
要求：定义一个方法，把int数组中的数据按照指定个格式拼接成一个字符串返回，调用该方法，在console输出
 * 举例：int[] arr = {1,2,3};
 * 输出结果：[1, 2, 3]

 思路：
 * 		A:定义一个int类型的数组，用静态初始化完成数组元素的初始化
 * 		B:定义一个方法，用于把int数组中的元素按照指定的格式拼接成一个字符串
          两个明确
           返回值类型 String
           参数 int[] arr
  * 	C:在方法中用StringBuilder按照要求进行拼接，并把结果转成string返回
  * 	D:调用方法,用一个变量接收结果
 *      E：输出结果


 */
public class case05StringStrcat_Upgraded {
    public static void main(String[] args) {
        //定义一个int类型的数组，用静态初始化完成数组元素的初始化
        int[] arr = {1,2,3};
        //调用方法,用一个变量接收结果
        String s = ArrayToString(arr);
        //输出结果
        System.out.println("s:"+s);
    }


    //定义一个方法，用于把int数组中的元素按照指定的格式拼接成一个字符串
     /*     两个明确
           返回值类型 String
           参数 int[] arr
     */
    public static String ArrayToString(int[] arr){
        //在方法中用StringBuilder按照要求进行拼接，并把结果转成string返回
        StringBuilder strb = new StringBuilder();
        //先拼接两端括号
        strb.append("[");

        for(int i = 0; i<arr.length;i++){
            if(i == arr.length-1){
                strb.append(arr[i]);
            }else{
                strb.append(arr[i]).append(",");
            }
        }
        strb.append("]");
        //结果转成string返回
        String s = strb.toString();
        return s;
    }
}
