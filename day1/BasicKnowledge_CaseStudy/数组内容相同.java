package day1.BasicKnowledge_CaseStudy;
/*
设计一个方法，用于比较两个数组内容是否相同

思路：
1、定义两个数组，分别使用静态初始化完成数组元素的初始化
2、定义一个方法，用于比较两个数组内容是否相同
   方法--两个明确
   返回值类型：boolean--回答：是或者不是
   参数： int[] arr, int[] arr2

3、在方法里面开始写：比较两个数组的内容是否相同的步骤
   （1）比较数组的长度，如果长度不同，数组内容肯定不同，返回false
   （2）遍历，比较两个数组只每一个元素，只要元素不同，返回false
   （3）循环遍历结束之后，返回true---why--当整个的循环都结束后，所以数组元素都相等
4、调用方法，用变量接收
5、输出结果
 */
public class 数组内容相同 {
    public static void main(String[] args) {
        //定义两个数组，分别使用静态初始化完成数组元素的初始化
        int [] arr = {11,22,33,44,55};
        int [] arr2 = {11,22,33,44,5};

        //调用方法，用变量接收
        boolean flag = compare(arr,arr2);
        //输出结果
        System.out.println(flag);

    }
    /*
    定义一个方法，用于比较两个数组内容是否相同
   方法--两个明确
   返回值类型：boolean--回答：是或者不是
   参数： int[] arr, int[] arr2
     */
    public static boolean compare(int[] arr, int[] arr2) {
        //比较数组的长度，如果长度不同，数组内容肯定不同，返回false
        if(arr.length != arr2.length){
            return false;
        }
        //遍历，比较两个数组只每一个元素，只要元素不同，返回false
        //x<arr.length或者x<arr2.length都可以，因为只有数组长度相同才走到for这一块
        for(int x =0; x<arr.length;x++){
            if(arr[x] != arr2[x]){
                return false;
            }

        }
        //当整个的循环都结束后，所以数组元素都相等
        //循环遍历结束之后，当长度相同和元素相同，返回true
        return true;

    }

}
