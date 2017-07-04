package access;

import access.dessert.Cookie;

/**
 * Created by Zhugw on 2017/6/10.
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }
    public void chomp(){
//   !     bite();
    }

    public static void main(String[] args) {
        ChocolateChip x=new ChocolateChip();
        x.chomp();
    }

}
