package holding;

import java.util.Map;

/**
 * Created by Zhugw on 2017/6/22.
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry:System.getenv().entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
