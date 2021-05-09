package com.dm;
/*
    继承
        面向对象三大特征：封装、继承、多态
        继承可以使得子类具有父类的属性和方法，还可以在子类中重新定义，追加属性和方法
        public class 子类名 extends 父类名{}

        好处：
            提高了代码的复用性，多个类相同的成员特征可以放到同一个类中
            提高了代码的维护性
        弊端
            类的耦合性增强了，削弱了子类的独立性
        体现关系 A是B的一种

        继承中变量访问的特点：
            在子类方法中访问一个变量age
                子类局部变量查找age
                子类成员变量查找this.age
                父类成员变量查找super.age
                不考虑父类的父类
            如果是子类访问父类的方法，那么即使子类中有相同名称的成员变量，仍然使用父类方法中的局部变量或成员变量
        关键字
            this:代表本类对象的引用 ，可以访问成员变量、构造方法、成员方法
            super：代表父类对象的引用，可以访问成员变量、构造方法、成员方法
                super.age
                super()
                super.show()
        构造方法
            子类中所有的构造方法默认都会访问父类中无参的构造方法
                子类初始化前需要先完成父类数据的初始化
                每一个子类构造方法的第一个语句是super()
            如果父类中没有无参构造方法，子类中可以使用super(参数)去调用父类的带参数构造方法
        成员方法：
            子类成员范围找
            父类成员范围找

        方法重写
            子类出现和父类一模一样的方法名
            @Override 注解
                可以帮助检查重写方法的方法声明的正确性
            注意：父类私有方法不能被重写（父类私有成员不能被继承）
                 子类方法的访问权限不能更低（public>默认>private)
            快捷方式：直接在子类中写父类方法的方法名
        继承注意事项
            类只支持单继承，不支持多继承
            支持多层继承

* */
public class inherit {
    public static void main(String[] args) {
        father father = new father();
        father.show();
        son son = new son();
        son.show();
        son.method();
//        System.out.println(age);
    }
    static class father{
        public int age=40;
        public void show(){
            System.out.println("yellow and red");
            System.out.println(age);
        }
    }
    static class son extends father{
        public  int height=175;
        public int age=30;
        public void method(){
            System.out.println("blue");
            System.out.println(age);
            System.out.println(height);
        }
    }
}
