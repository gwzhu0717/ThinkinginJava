package initialization;

/**
 * Created by Zhugw on 2017/6/10.
 */
public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s:Spiciness.values()) {
            System.out.println(s+",ordinal"+s.ordinal());
        }
    }
}
