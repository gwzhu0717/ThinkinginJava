package access;

/**
 * Created by Zhugw on 2017/6/10.
 */
class Sundae{
    private Sundae(){}
    static Sundae makeASundae(){
        return new Sundae();
    }
}
public class IceCream {
    public static void main(String[] args) {
//        Sundae x=new Sundae();
           Sundae x=Sundae.makeASundae();
    }
}
