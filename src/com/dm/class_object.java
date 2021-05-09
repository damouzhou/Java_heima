package com.dm;

public class class_object {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand="huawei";
        phone.price=7999;
        System.out.println(phone.brand);
        System.out.println(phone.price);
        phone.call();
        phone.send();

    }
    /*
        类是显示生活中一类具有共同属性和行为的事务的抽象
        类的组成：
            属性：在类中通过成员变量体现，类中方法外的变量
            行为：在类中通过方法来体现，去掉static关键字
        成员变量：类中方法外的变量；堆内存；随对象存在而存在，对象的消失而消失；有初始的默认值
        局部变量：方法中的变量，方法声明上（形参）；栈内存；随方法的调用而存在，方法调用完毕而消失；没有默认值，必须先定义
    */
    static class Phone{
        String brand;
        private int price;

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        public void call(){
            System.out.println("打电话");
        }
        public void send(){
            System.out.println("send message");
        }
    }
    /*
        封装
        private 修饰成员变量和成员方法，可以保护成员不被别的类使用，只能在本类中才能访问
        如果需要被别的类使用，需要使用get()，set()方法，使用public修饰
        this 修饰变量可以指代成员变量（在局部变量与成员变量同名时，局部变量会覆盖成员变量）
            方法的形参如果与成员变量同名，不带this修饰的变量值得是形参，而不是成员变量
            方法的形参如果没有与成员变量同名，不带this修饰的变量就是成员变量
            this代表所属的类
        封装原则：将类的某些信息隐藏在类内部，不允许外部程度直接访问，而是通过该类提供的方法来实现对隐藏信息的操作和访问
        封装好处：通过方法来控制成员变量的操作，提高代码的安全性和复用性

        构造方法
            是一种创造对象的特殊方法，主要完成对象数据的初始化
            如果没有定义构造方法，系统将给出默认的无参数构造方法
            如果定义了构造方法，系统将不再给出默认构造方法，需要自己构建无参数方法

        标准类的制作
            成员变量 使用private修饰
            构造方法
                提供无参构造方法
                提供带参数构造方法
            成员方法
                提供get()/set()方法
            创建对象并为成员变量赋值的两种方式
                使用无参构造方法，并set()
                使用带参构造方法
    */

}
