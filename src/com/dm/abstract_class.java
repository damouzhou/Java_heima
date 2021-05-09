package com.dm;
/*
    抽象类
        一个没有方法体的方法定义为抽象方法，而包含抽象方法的类则为抽象类
        抽象方法：public abstract void 方法名（）
        抽象类：public abstract 类名{}
        注意：
            抽象类中不一定有抽象方法，有抽象方法的一定是抽象类
            抽象类不能实例化（创建对象）
                抽象类多态：可以通过多态的方式，通过子类进行对象实例化，在子类中重写方法
            抽象类的子类
                要么重写抽象类中的所有抽象方法，要么本身也是抽象类
            抽象类可以有成员变量
            抽象类可以有构造方法，但不能实例化，用于子类访问父类数据的初始化，
            抽象类可以有成员方法：
                抽象方法：限定子类必须完成某些动作
                非抽象防范：提高代码的可复用性
*/
public abstract class abstract_class {
    private int age=20;
    private final int weight=30;
    public abstract_class() {

    }
    public abstract_class(int age){
        this.age=age;
    }

    public abstract void eat();
}
