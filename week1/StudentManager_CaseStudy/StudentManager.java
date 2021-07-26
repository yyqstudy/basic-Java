package week1.StudentManager_CaseStudy;
//Student s = array.get(i);同时存在几个方法内，但是不会混淆

import java.util.ArrayList;
import java.util.Scanner;
/*
学生管理系统
1、添加学生
2、删除学生
3、修改学生
4、查看所有学生
5、退出
 */
public class StudentManager {
    /*
    1）用输出语句完成主界面的编写
    2）用Scanner 实现键盘录入数据
    3）用switch语句完成操作的选择
    4）用循环完成再次回到主界面（输入1--添加学生--回到主界面添加）----死循环while（true）
     */
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据--由于以下删除查看等等都是同一个ArrayList，所以在main()定义一个ArrayList
        ArrayList<Student> array = new ArrayList<Student>();
        //***用循环完成再次回到主界面
        while(true) {
            //用输出语句完成主界面的编写
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            //用Scanner 实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine(); //变量名是line

            //用switch语句完成操作的选择
            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(array);//第23行代码的array，调用方法的参数是一个ArrayList--由于以下删除查看等等都是同一个ArrayList，所以在main()定义一个ArrayList
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    findALLStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
//                    break;
                    System.exit(0);//JVM退出--输入5时候程序一定结束
            }
        }
    }

    //*****************

    //定义一个方法，用于添加学生信息
    /*
    3、添加学生的代码编写
     1）用键盘录入选择添加学生
     2）定义一个方法，用于添加学生
       （1）显示提示信息，提示要输入何种信息
       （2）键盘录入学生对象所需要的数据
       （3）创建学生对象，把键盘录入的数据赋值给学生对象的成员变量（sid、name、age、address）
       （4）将学生对象添加到集合中（保存）
       （5）给出添加成功提示
      3）、调用方法
     */
    public static void addStudent(ArrayList<Student> array) {


      //用键盘录入学生对象所需要的数据，显示提示信息，提示要输入何种信息
        Scanner sc = new Scanner(System.in);
        String sid;//为了让sid在while循环外面被访问到，我们把它定义在循环外面

        //为了让程序能够回到这里，我们使用循环实现--while(true)
        while(true){
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();;
            //String sid = sc.nextLine();--如果放在循环里面，下面s.setSid(sid);会报错，要在while循环外面
            //在添加学生录入学号后调用该方法
            boolean flag = isUsed(array,sid);
            //在定义方法中，flag设为false；但这里没有写清楚true，是不是默认的---是默认的
            if(flag){
                System.out.println("你输入的学号已经被占用，请重新输入");
            }else{
                break;//如果不被使用，直接退出循环，不用回到"请输入学号"那里
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量（sid、name、age、address）
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

       //将学生对象添加到集合--array.add()
       array.add(s);
       //给出添加成功提示
       System.out.println("添加学生成功");
     }

    //定义一个方法，判断学号是否被使用
    //参数：集合与学号，判断学号是否在集合内
    public static boolean isUsed(ArrayList<Student> array,String sid) {
        //如果与集合中对某一个学生学号相同，返回true；如果都不相同，返回false
        boolean flag = false;//先定义一个boolean值
        for(int i =0;i<array.size();i++){
            Student s = array.get(i);
            //如果s.getSid()从集合那里获取的学号=方法中参数的String sid相同，就输出true
            //如果不相等，不会进入if语句，直接return flag
            if(s.getSid().equals(sid)){
                flag = true;
                break;
            }
        }
        return flag;
    }
    //************
    //定义一个方法，用于查看学生信息
    /*
    4、查看所有学生代码
     思路
      1）用键盘录入选择查看所有学生信息
      2）定义一个方法，用于查看学生信息
         （1）显示表头信息
         （2）将集合中数据取出按照对应格式显示学生信息，年龄显示补充"岁"
      3）调用方法
     */
    public static void findALLStudent(ArrayList<Student> array) {
        //判定集合中是否有数据，如果没有显示提示信息
        if(array.size() == 0){
            System.out.println("无信息，请先添加信息再查询");
            return;//有了return，如果没有信息，它不会往下执行，输出表头信息：学号  姓名 年龄 居住地
        }

        //显示表头信息，用\t（就是tab键）缩进
        //显示格式可以加多几个\t来调整
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
        //将集合中数据取出按照对应格式显示学生信息，年龄显示补充"岁"
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" +s.getName() + "\t" + s.getAge()+"岁\t\t"+s.getAddress());
        }
    }


    //定义一个方法，用于删除学生信息
    /*
    5、删除学生的代码编写
     思路
     1）用键盘录入选择删除学生信息
     2）定义一个方法，用于删除学生信息
       （1）显示提示信息
       （2）键盘录入要删除学生学号
       （3）遍历集合将对应学生对象从集合中删除
       （4）给出删除成功提示
     3）调用方法
     */
    public static void deleteStudent(ArrayList<Student> array) {
        //用键盘录入选择删除学生信息，显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生学号：");
        String sid = sc.nextLine();

        //遍历集合将对应学生对象从集合中删除
        int index = -1;//因为如果在for循环里面if语句定义 int index = i；在另外一个if里面接收不了
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);

            /*
             在删除/修改学生操作之前，对学号进行判断
             1）如果不存在，显示提示信息
             2）如果存在，执行删除/修改操作
             */
            //字符串内容比较是否相同用equals()
            if(s.getSid().equals(sid)){
                //array.remove(i);
                //int index = i;并不能在for循环外面使用
                index = i;
                break;
            }
            if(index == -1){
                System.out.println("该信息不存在，请重新输入");
            }else{
                array.remove(index);
            }
        }

        //给出删除成功提示
        System.out.println("删除学生成功");
    }



    //定义一个方法，用于修改学生信息
    /*
    6、修改学生的代码编写

     思路
     1、用键盘录入选择修改学生信息
     2、定义一个方法，用于修改学生信息
      （1）显示提示信息
      （2）键盘录入要修改学生学号
      （3）键盘录入要修改学生信息
      （4）遍历集合修改对应学生对象
      （5）给出修改成功提示
     3、调用方法
     */
    public static void updateStudent(ArrayList<Student> array) {
        //键盘录入要修改学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要修改的学生学号：");
        String sid = sc.nextLine();

        //键盘录入要修改学生信息
        System.out.println("请输入学生新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生新居住地：");
        String address = sc.nextLine();

        //创建学生对象--s是新的--与添加学生创建对象一样定义s--不会混淆？
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //遍历集合修改对应学生对象
        for (int i = 0; i <array.size() ; i++) {
            Student student = array.get(i);
            if(student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }

        }

        //给出修改成功提示
        System.out.println("修改学生成功");

    }


}
