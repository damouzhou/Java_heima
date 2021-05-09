package com.dm;

public class rabbit {
    public static void main(String[] args) {
        int[] arr=new int[20];
        arr[0]=1;
        arr[1]=1;
        for (int i=2;i<20;i++){
            arr[i]=arr[i-1]+arr[i-2];
            System.out.println("第"+(i+1)+"个月共有:"+arr[i]+"只兔子");
        }
    }
}
