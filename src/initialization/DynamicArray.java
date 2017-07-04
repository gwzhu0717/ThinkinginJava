package initialization;

/**
 * Created by Zhugw on 2017/6/10.
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"fiddle","de","dum"});
    }
}

class Other{
    public static void main(String[] args) {
        for (String s:args) {
            System.out.print(s+" ");
        }
    }
}
