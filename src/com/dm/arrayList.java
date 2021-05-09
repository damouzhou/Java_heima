package com.dm;

import java.util.ArrayList;

/*
 集合：提供存储空间可变的存储模型，存储的数据容量可以发生变化
    ArrayList<E>
        可调整大小的数组实现，
        <E>：是一种特殊的数据类型，泛型，引用类型
        集合也会有索引越界的现象,添加、删除、修改和查找都需要注意
        size():集合长度
*/
public class arrayList {
    public static void main(String[] args) {

        ArrayList<String> array=new ArrayList<String>();
        array.add("good");
        array.add("morning");
        System.out.println(array);
        array.add(1,"today is a sunny day");
        System.out.println(array.remove("morning"));
        System.out.println(array.remove(0));
        System.out.println(array.set(0,"windy"));
        System.out.println(array.get(0));

        System.out.println(array);
    }
}
