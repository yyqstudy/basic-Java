package week1.String字符串;
/*
拼接字符串
要求：定义一个方法，把int数组中的数据按照指定个格式拼接成一个字符串返回，调用该方法，在console输出
 * 举例：int[] arr = {1,2,3};
 * 输出结果：[1, 2, 3]
 *
 * 分析：
 * 		A:定义一个int类型的数组，用静态初始化完成数组元素的初始化
 * 		B:定义一个方法，用于把int数组中的元素按照指定的格式拼接成一个字符串
          两个明确
           返回值类型 String
           参数 int[] arr
 * 		C:在方法中遍历数组，按照要求进行拼接
 * 		D:调用方法,用一个变量接收结果
 *      E：输出结果

 */
public class case03StringStrcat {
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
        //在方法中遍历数组，按照要求进行拼接
        //定义一个字符串，最后返回一个字符串
        String s ="";
        //输出结果：[1, 2, 3]
        s += "[";
        for(int i = 0; i<arr.length;i++){
            //如果是最后一个
            if(i == arr.length-1){
                s += arr[i];
            }else{
                s += arr[i];
                s += ",";
            }
        }
        s += "]";
        return s;
    }
}
