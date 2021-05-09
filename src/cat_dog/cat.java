package cat_dog;

public class cat extends Animal implements Jumpping{
    public cat(){

    }

    public cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("cat eat fish");

    }

    @Override
    public void jump() {
        System.out.println("cat can jumpping");

    }
}
