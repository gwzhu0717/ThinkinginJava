package access;


import access.cookie2.Cookie;

/**
 * Created by Zhugw on 2017/6/10.
 */
public class ChocolateChip2 extends Cookie {
    public ChocolateChip2() {
        System.out.println("ChocolateChip2 constructor");
    }
    public void chomp(){
        bite();
    }

    public static void main(String[] args) {
        ChocolateChip2 x=new ChocolateChip2();
        x.chomp();
    }
}
