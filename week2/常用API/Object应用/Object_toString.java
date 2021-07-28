package week2.常用API.Object应用;
/*
Object：是超类，所有类都直接或者间接继承该类
构造方法： public Object()
回想面向对象，为什么说子类的构造方法默认访问的是父类的无参数构造方法？
因为它们的顶级父类只有无参数构造

看方法的源码--点println--Go to --Declaration
toString方法返回的结果是内存地址
建议所有子类重写此方法
如何重写？自动生成即可--快捷键command+N+I--toString()
 */
public class Object_toString {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("Olyvia");
        s.setAge(20);
        System.out.println(s);

       /*
       // x---s
       public void println(Object x) {
           String s = String.valueOf(x);
           synchronized (this) {
              print(s);
              newLine();
           }
        }
       //obj---x
        public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }

       //返回地址
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        */
        System.out.println(s.toString());
    }
}
