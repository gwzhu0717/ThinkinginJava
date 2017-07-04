package holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Zhugw on 2017/6/21.
 */
public class Statistics {
    public static void main(String[] args) {
        Random rand=new Random(47);
        Map<Integer,Integer> m=new HashMap<Integer, Integer>();
        for (int i = 0; i < 10000; i++) {
            int t=rand.nextInt(20);
            Integer freq=m.get(t);
            m.put(t,freq==null?1:freq+1);
        }
        System.out.println(m);
    }
}

/*
在main()方法中，自动包装机制将随机生成的int转换为HashMap可以使用的Integer引用。
如果键不在容器中，get()方法将返回null（这表示该数字第一次被找到）。否则，get()方法
将产生与该键相关联的Integer值，然后这个值被递增（自动包装机制再次简化了表达式，但是
确实发生了对Integer的包装和拆包）
 */