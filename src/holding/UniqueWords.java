package holding;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Zhugw on 2017/6/21.
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}

/*
TextFile继承自List<String>，其构造器将打开文件，并根据正则表达式“\\W+”将其断开为单词，这个正则表达式表示
“一个或多个字母”。所产生的结果传递给TreeSet的构造器，它将把List中的内容添加到自身中。由于它是TreeSet，因此其结果
是排序的。在本例中，排序是按字典序进行的，因此大写和小写字母被划分到了不同的组中。
如果你想按照字母序排序，那么可以向TreeSet的构造器传入String.CASE_INSENSITIVE_ORDER比较器
 */