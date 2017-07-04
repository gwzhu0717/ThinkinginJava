package initialization;

/**
 * Created by Zhugw on 2017/6/9.
 */
class Person{
    public void eat(Apple apple){
        Apple peeled=apple.getpeeled();
        System.out.println("Yummy");
    }
}
class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}
class Apple{
    Apple getpeeled(){
        return  Peeler.peel(this);
    }
}
public class PassingThis {
    public static void main(String[] args) {
        Person p=new Person();
        p.eat(new Apple());
    }
}
