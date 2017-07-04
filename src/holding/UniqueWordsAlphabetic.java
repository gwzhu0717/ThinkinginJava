package holding;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Zhugw on 2017/6/21.
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words =
                new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(
                new TextFile("SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
