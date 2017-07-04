package holding;

import java.util.Arrays;

/**
 * Created by Zhugw on 2017/6/22.
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib){
        for (T t:ib) {
            System.out.print(t+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test(Arrays.asList(1,2,3));
        String[] strings={"A","B","C"};
        test(Arrays.asList(strings));
    }
}

/*
foreach语句可以用于数组或其他任何Iterable，但是这并不意味着数组肯定也是一个Iterable，而任何自动
包装也不会自动发生。
尝试把数组当作一个Iterable参数传递会导致失败。这说明不存在任何从数组到Iterable的自动转换，你必须手动
执行这种转换。
 */