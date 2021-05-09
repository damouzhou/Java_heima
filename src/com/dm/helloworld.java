package com.dm;


import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("hello world");
        /*
         * psvm
         * sout
         * ctrl+alt+space 内容提示
         * 注释：
         *  ctrl+/：单行注释
         *  ctrl+shift+/：多行注释
         * 格式化：ctrl+alt+l
         * 方法补全等号前代码 ctrl+alt+v
         * 查看方法源代码 选中方法，ctrl+B
         * 重写方法：alt+insert
         * */
        int[] arr=new int[3];
        /*
        栈内存：存储局部变量，定义在方法中的变量，使用完毕后消失arr
        堆内存：存储new出来的内容（实体，对象），数组在初始化时，会为存储空间添加默认值，使用完毕后，会在垃圾回收器空闲时回收arr[0]
        */
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] arr2=new int[]{1,2,3};
        int[] arr3={3,4,5};
        System.out.println(arr3);
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        /*
        * 索引越界：ArrayIndexOutOfBoundsException 访问了数组不存在的索引对应的元素
        * 空指针异常：NullPointerException 访问的数组已经不再指向堆内存的数据，造成空指针异常。arr=null
        * */
        /*方法：
        *   形参：方法定义中的参数
        *   实参：方法调用中的参数 等同于变量或常量
        *   对于基本数据类型的参数，形式参数的改变，不影响实际参数的值
        *   对于引用类型的参数，形式参数的改变，影响实际参数的值，数组索引就是引用类型
        * 方法不能被嵌套定义
        * void表示无返回值，可以省略return，也可以单独书写return，不加数据，return代表方法已经结束了
        * 方法重载：
        *  指同一个类中定义的多个方法之间的关系，满足以下条件的多个方法构成重载
        *       多个方法在同一个类中
        *       多个方法具有相同的方法名
        *       多个方法的参数不相同：类型不同或者数量不同
        *       无论返回值相同或者不同，都不影响
        *   重载仅针对方法的定义，与方法的调用无关
        *   重载仅针对于同一个类中方法的名称和参数进行识别，与返回值无关，不能通过返回值来判定两个方法是够相互构成重载
        *   */
        isSingleNumber(5);
        int sum=sum(10,20);
        double sum2=sum(10,20);
        int sum3=sum(10,20,30);
        System.out.println(sum+" "+sum2+" "+sum3);
        change(arr);
        System.out.println(arr[1]);
        printArray(arr3);
        Scanner sc=new Scanner(System.in);
    }
    public static void isSingleNumber(int i){
        if(i%2==0){
            System.out.println("is not single");
        }else{
            System.out.println("this number is single");
        }
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void change(int[] arr){
        arr[1]=100;
    }
    public static void printArray(int[] arr){
        for (int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
    }
}
