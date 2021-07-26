package week1.流程控制;


/*
要求：珠穆朗玛峰高8844430毫米，如果有一张足够大的纸，厚度是0.1毫米。需要折叠多少次，可以折叠成珠穆朗玛峰的高度
分析：
1、反复折叠--使用循环语句，但是不知道折叠次数，此时更适合while循环
while(条件判断语句){循环体}

2、循环执行过程中，纸张折叠，纸张的厚度要加倍，因此要定义纸张的厚度，在循环中使厚度加倍

double paper = 0.1;
while(条件判断语句){
paper *= 2;
}

3、当纸张厚度大于珠峰，折叠停止：执行的要求是纸张厚度小于珠峰

int zf = 8844430;
while(paper <= zf){……}

4、设置一个计数器，在循环中执行累加，对应折叠了多少次
int count = 0;
while (paper <= zf){
    count++;
}

 */
public class case06MountQomolangma {
    public static void main(String[] args) {
        //定义一个计数器，初始值为0
        int count = 0;
        //定义纸张厚度
        double paper = 0.1;
        //定义珠峰高度
        int zf = 8844430;
        //因为反复折叠，所以使用循环语句，但是不知道折叠次数，此时更适合while循环
        //当纸张厚度大于珠峰，折叠停止：执行的要求是纸张厚度小于珠峰
        while(paper<=zf){
            //循环执行过程中，纸张折叠，纸张的厚度要加倍
            paper *= 2;
            //在循环中执行累加，对应折叠了多少次
            count++;
        }
        //打印计数器的值
        System.out.println("需要折叠："+count+"次");
    }
}
