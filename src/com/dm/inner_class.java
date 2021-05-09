package com.dm;

/*
    内部类
        就是类中定义一个类
        访问特点：
            内部类可以直接访问外部类的成员，包括私有
            外部类要访问内部类的成员，需要创建对象
        成员内部类：
            在类的成员位置
            外界使用成员内部类
                外部类名.内部类名 对象名 =外部类对象.内部类对象
                Outer.Inner oi=new Outer().new Inner();
            一般是内部类是private的，然后外界调用使用的是外部类的方法，然后方法中含有创建内部类的方式
        局部内部类
            在类的局部位置，在方法里创建内部类
            该类可以访问外部类的成员，也可以访问方法内的局部变量
            外界无法使用，需要在方法中实例化内部类对象，再到外界中调用该方法

        匿名内部类
            前提：存在一个类或者接口
            本质：是一个集成了该类或者实现了该接口的子类匿名对象，只不过这个对象没有内容
            形式：
                new 类名或者接口名(){
                    重写方法；
                }；
            在开发中的使用：
                 匿名内部类，可以省去在调用接口时需要创建很多对象的麻烦，见package inner_class



*/

public class inner_class {
    private int num=30;


    public void method(){
        class part_inner{
            public void show(){
                System.out.println("part_inner");
                System.out.println(num);
            }
        }
    }

    private class inner{
//        private int num=20;

        public void show(){
            System.out.println("hello");
            System.out.println(num);
        }
    }

}
