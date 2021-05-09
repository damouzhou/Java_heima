package API;

/*
    Arrays
        java.utils
        包含用于操作数组的各种方法
        toString
        sort

     工具类的设计思想：
        构造方法用private修饰
        成员用public static修饰

* */

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] arr=new int[]{1,4,2,6,3,8,5};
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

        System.out.println(Arrays.toString(arr));
        int[] arr2=new int[]{2,1,4,5,7,9,3,6};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
