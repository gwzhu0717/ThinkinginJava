package holding;

import typeinfo.pets.*;

import java.util.*;

/**
 * Created by Zhugw on 2017/6/22.
 */
public class MapOfList {
    public static Map<Person, List<? extends Pet>>
            petPeople = new HashMap<Person, List<? extends Pet>>();
    static {
        petPeople.put(new Person("Dawn"),
                Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
        petPeople.put(new Person("Kate"),
                Arrays.asList(new Cat("Shackleton"),
                        new Cat("Elsie May"), new Dog("Margrett")));
        petPeople.put(new Person("Marilyn"),
                Arrays.asList(
                        new Pug("Louie aka Louis Snorkelstein Dupree"),
                        new Cat("Stanford aka Stinky el Negro"),
                        new Cat("Pinkola")));
        petPeople.put(new Person("Luke"),
                Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
        petPeople.put(new Person("Isaac"),
                Arrays.asList(new Rat("Freckly")));
    }
    public static void main(String[] args) {
        System.out.println("People: " + petPeople.keySet());
        System.out.println("Pets: " + petPeople.values());
        for(Person person : petPeople.keySet()) {
            System.out.println(person + " has:");
            for(Pet pet : petPeople.get(person))
                System.out.println("    " + pet);
        }
    }
}

/*
Map与数组和其他的Collection一样，可以很容易地扩展到多维，而我们只需将其值设置为
Map（这些Map的值可以是其他容器，甚至是其他Map）。因此，我们能够很容易地将容器组合起来
从而快速地生成强大的数据结构。
Map可以返回它的键的Set，它的值的Collection，或者它的键值对的Set。keySet()方法产生了
由Map中的所有的键集合，valueSet方法产生了所有的值集合。
 */