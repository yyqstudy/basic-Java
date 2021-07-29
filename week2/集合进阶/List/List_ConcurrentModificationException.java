package week2.集合进阶.List;
/*
判断集合中是否包含元素world，如果有则添加元素javaee

 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_ConcurrentModificationException {
    public static void main(String[] args) {
        //创建集合对象

        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //我们可以通过遍历来获取集合中的每一个元素，然后进行比较即可
        //但是出现ConcurrentModificationException并发修改异常问题：实际修改集合的次数与预期修改集合次数不相等
		/*Iterator it = list.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			if(s.equals("world")) {
				list.add("javaee");
			}
		}*/
        //method1:用for循环即可---get()
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("world")){
                list.add("javaee");
            }

        }

        //----------------------------
        //method2: ListIterator中的add()
        //istIterator()任何一方向遍历
         //正向遍历
        ListIterator lit = list.listIterator();
        while(lit.hasNext()) {
            String s = (String)lit.next();

            if(s.equals("world")) {
                lit.add("javaee");
            }
        }
        System.out.println(list);
        System.out.println("---------------");


        //----------------
        //逆向遍历
      /*  System.out.println("reverse-travel");
        while(lit.hasPrevious()) {
            String s = (String)lit.previous();
            System.out.println(s);
        }
*/
    }
}
