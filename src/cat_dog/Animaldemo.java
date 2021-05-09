package cat_dog;

public class Animaldemo {
    public static void main(String[] args) {
        Jumpping j=new cat();
        j.jump();
        System.out.println("-------");
        Animal a=new cat();
        a.setName("笨笨");
        a.setAge(6);
        System.out.println(a.getAge()+" "+a.getName());
        a.eat();
        cat c=new cat();
        c.setAge(15);
        c.setName("hello");
        System.out.println(c.getAge()+" "+c.getName());
        c.eat();
        c.jump();
    }
}
