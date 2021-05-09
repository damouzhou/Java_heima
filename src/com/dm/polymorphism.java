package com.dm;
/*
    多态
        同一个对象，在不同时刻表现出来的不同形态
        前提和实现：
            有继承/实现关系
            有方法重写
            有父类引用指向子类的对象
        多态的形式访问
            成员变量：编译看左边父类，运行也看左边父类
            成员方法：编译看左边父类，运行看右边子类
            因为成员方法有重写，而成员变量没有
            如果访问的是未被重写的成员方法，则只能编译运行左边父类的，不能访问子类的
        好处：
            提高了程序的可拓展性
                可以在定义方法时使用父类作为参数，调用方法时使用具体的子类参与操作
        弊端：
            不能使用子类特有的功能，只能使用父类存在（包括被子类重写）的方法
        多态的转型：
            向上转型
                从子到父，父类引用指向子类对象
                Animal a=new Cat();
            向下转型
                从父到子，子类引用指向父类对象
                Cat c=(Cat)a
            子类之间不能相互转型，会出现ClassCastException

*/
public class polymorphism {
    public static void main(String[] args) {
        Animal an = new Cat();
        System.out.println(an.age);
        an.eat();
        an.dog();
        Cat c=(Cat)an;
        c.show();
    }

    static class Animal{
        public int age=10;
        public int weight=8;
        public void eat(){
            System.out.println("动物吃东西");
        }
        public void dog(){
            System.out.println("pretty dog");
        }
    }
    static class Cat extends Animal{
        public int age=18;

        @Override
        public void eat() {
            System.out.println("猫吃鱼");
        }
        public void show(){
            System.out.println("I am a cat");
        }
    }
}
