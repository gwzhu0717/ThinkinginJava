package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * Created by Zhugw on 2017/6/22.
 */
public class CollectionSequence extends AbstractCollection<Pet>{
    private Pet[] pets= Pets.createArray(8);
    public int size(){return pets.length;}
    public Iterator<Pet> iterator(){
        return new Iterator<Pet>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        CollectionSequence c=new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
