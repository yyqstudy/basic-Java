package week2.常用API.Array;
/*
冒泡排序
一种排序方式，对要进行排序对数据中相邻对数据进行两两比较，将较大数据放在后面，依次对所有数据进行操作，直至所有数据按要求完成排序

 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        //
        int[] arr = {24,69,80,57,13};
        System.out.println("排序前："+arrayToString(arr));

        /*//第一次比较
        //i <arr.length-1 以免ArrayIndexOutOfBoundsException
        for (int i = 0; i <arr.length-1 ; i++) {
            //相邻元素比较
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        //第一次比较后，最大值出现在最后面
        System.out.println("第一次比较后："+arrayToString(arr));

        //第二次比较
        //i <arr.length-1-1，因为第一次比较完，有一个元素不用比较，，所有再一次减1
        for (int i = 0; i <arr.length-1-1 ; i++) {
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第二次比较后："+arrayToString(arr));
        */

        //*********
        //代码优化--变化对只是i <arr.length-1-x
        //如果有n个数据进行排序，总共需要比较n-1次 -----x < arr.length-1
        for (int x = 0; x < arr.length-1; x++) {
            for (int i = 0; i <arr.length-1-x ; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("排序后："+arrayToString(arr));

    }

    //定义方法--把数组元素组成一个字符串[元素1,元素2，……]
    //两个明确：参数--数组；返回值--string--在循环外面
    public static String arrayToString(int[] arr){
        StringBuilder strb =new StringBuilder();
        strb.append("[");
        for (int i = 0; i <arr.length ; i++) {
            if(i == arr.length - 1){
                strb.append(arr[i]);
            }else{
                strb.append(arr[i]).append(",");
            }
        }
        strb.append("]");
        String s = strb.toString();
        return s;
    }
}
