package reusing;

/**
 * Created by Zhugw on 2017/6/11.
 */
class Home{
    char doh(char c){
        System.out.println("doh(char)");
        return c;
    }
    float doh(float c){
        System.out.println("doh(float)");
        return c;
    }
}

class Milhouse{
}

class Bart extends Home{
    void doh(Milhouse m){
        System.out.println("doh(Milhouse)");
    }

    public static void main(String[] args) {
        Bart b=new Bart();
        b.doh('c');
        b.doh(1);
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
public class Hide {
}
