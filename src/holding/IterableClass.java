package holding;

import java.util.Iterator;

/**
 * Created by Zhugw on 2017/6/22.
 */
public class IterableClass implements Iterable<String>{
    protected String[] words = ("And that is how " +
            "we know the Earth to be banana-shaped.").split(" ");
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            public boolean hasNext() {
                return index < words.length;
            }
            public String next() { return words[index++]; }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args) {
        for(String s : new IterableClass())
            System.out.print(s + " ");
    }
}

/*
Java SE5引入了新的被称为Iterable的接口，该接口包含一个能够产生Iterator的iterator()方法，并且
Iterable接口被用来在序列中移动。因此，如果你创建了任何实现Iterable的类，都可以将它用于foreach语句中。
 */