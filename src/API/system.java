package API;

/*
    System
        最终类，没有子类
        不能被实例化，不能创建对象
        成员都是被静态修饰的，所以不需要创建对象，直接可以通过类名访问

        exit
            终止当前运行的java状态机，非零表示异常终止
        currentTimeMills：返回当前时间（long）
*/

public class system {
    public static void main(String[] args) {
        System.out.println("start");
//        System.exit(0);
        System.out.println("end");
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365+1970+"年");
        System.out.println(System.currentTimeMillis());
    }
}
