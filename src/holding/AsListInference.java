package holding;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Zhugw on 2017/6/21.
 */
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1= Arrays.asList(new Powder(),new Crusty(),new Slush());
        // Won't compile:
        // List<Snow> snow2 = Arrays.asList(
        //   new Light(), new Heavy());
        // Compiler says:
        // found   : java.util.List<Powder>
        // required: java.util.List<Snow>

        // Collections.addAll() doesn't get confused:
        List<Snow> snow3=new ArrayList<Snow>();
        Collections.addAll(snow3,new Light(),new Heavy());
        // Give a hint using an
        // explicit type argument specification:
        List<Snow> snow4=Arrays.<Snow>asList(new Light(),new Heavy());
    }
}

/*
当试图创建snow2时，Arrays.asList()中只有Powder类型，因此它会创建List<Powder>而不是List<Snow>，尽管
Collections.addAll()工作很好，因为它从第一个参数中了解到目标类型是什么。
正如从创建snow4的操作中所看到的，可以在Arrays.asList()中间插入一条“线索”，以告诉编译器对于由Array.asList()
产生的List类型，实际的目标类型应该是什么。这称为显式类型参数说明。
 */