package week2.集合进阶.泛型.泛型接口;

import week2.集合进阶.泛型.泛型接口.GenericInterface;

/*
接口实现类
 */
public class GenericInterfaceImpl <T> implements GenericInterface<T> {
    @Override
    public void show(T t) {
        System.out.println(t);

    }
}
