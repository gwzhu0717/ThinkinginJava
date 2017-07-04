package initialization;

/**
 * Created by Zhugw on 2017/6/9.
 */
class Bird2{
    public Bird2(int i) {
    }
    public Bird2(double d){

    }
}
public class NoSynthesis {
    public static void main(String[] args) {
        Bird2 b2=new Bird2(1);
        Bird2 b3=new Bird2(1.0);
    }
}
