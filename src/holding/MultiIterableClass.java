package holding;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Created by Zhugw on 2017/6/22.
 */
public class MultiIterableClass extends IterableClass {
    public Iterable<String> reverse(){
        return new Iterable<String>() {
            @NotNull
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current=words.length-1;
                    @Override
                    public boolean hasNext() {
                        return current>-1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<String> randomized(){
        return new Iterable<String>() {
            @NotNull
            @Override
            public Iterator<String> iterator() {
                List<String> shuffed=new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(shuffed,new Random(47));
                return shuffed.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic=new MultiIterableClass();
        for (String s:mic.reverse()) {
            System.out.print(s+" ");
        }
        System.out.println();
        for (String s:mic.randomized()) {
            System.out.print(s+" ");
        }
        System.out.println();
        for (String s:mic) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
