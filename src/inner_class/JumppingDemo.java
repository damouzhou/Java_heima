package inner_class;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo=new JumppingOperator();
        Jumpping j=new Cat();
        jo.method(j);

//        匿名内部类，可以省去在调用接口时需要创建很多对象的麻烦
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("the dog is jumping");
            }
        });
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("the pig cannot jump");
            }
        });
    }
}
