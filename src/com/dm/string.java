package com.dm;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        for (int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
    /*
        API: Application Programming Interface 应用程序编程接口
        String
            Java程序中所有的双引号字符串，都是String类的对象
            字符串不可变，在创建后值不可更改
            虽然String的值不可变，但可以被共享
            char[],byte[]
            构造方法
                public String()：空白字符串对象
                public String(char[] chs): 根据字符数组创建字符串对象
                public String(byte[] bys): 根据字节数组创建字符串对象
                String s="abc"：直接赋值
                注：字符'a'相当于字节97
            特点：
                通过new创建的字符串对象，每次new都会申请一个内存空间，虽然内容相同，但是地址值不同
                通过直接赋值创建的字符串对象，只要字符串序列相同（顺序和大小写），
                无论出现多少次，jvm都只会建立一个String对象，并在字符串池中维护
            比较
                使用==作比较
                    基本类型：比较数据值是否相同
                    引用类型：比较地址值是否相同
                使用equals()方法:比较字符串对象的内容是否相同
                有可能内容相同但地址不同
            遍历:
                for (int i=0;i<s.length();i++){
                    System.out.println(s.charAt(i));}
                字符串长度是string.length(),数组长度是arr.length;
                charAt(i)获取字符串中的第i个字符

          StringBuilder
            使用原因：
                因为字符串不可变，如果对字符串进行拼接操作（s=s+"world")，每次拼接都会构造一个新的String对象，耗时且浪费内存
            定义：是一个可变的字符串类
            构造方法：
                public StringBuilder():创建一个空白可变字符串对象
                public StringBuilder(String str):根据字符串的内容创建看一遍字符串对象
            成员方法：
                append(任意类型)：添加数据，并返回对象本身，
                    可以使用链式编程，调用完方法后返回对象
                reverse():返回相反的字符序列
         String与StringBuilder相互转换
            StringBuilder -->String:使用toString()方法
            String-->StringBuilder:使用构造方法 public StringBuilder(String s)

    */
}
