package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Zhugw on 2017/6/21.
 */
public class SimpleIterator {
    public static void main(String[] args) {
        List<Pet> pets= Pets.arrayList(12);
        Iterator<Pet> it=pets.iterator();
        while (it.hasNext()){
            Pet p=it.next();
            System.out.print(p.id()+":"+p+" ");
        }
        System.out.println();
        for (Pet p:pets) {
            System.out.print(p.id()+":"+p+" ");
        }
        System.out.println();
        it=pets.iterator();
        for (int i = 0; i <6 ; i++) {
            it.next();
            it.remove();
        }
    }
}

/*
Iterator还可以移除由next()产生的最后一个元素，这意味着在调用remove()之前必须先调用next()。
 */