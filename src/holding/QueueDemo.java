package holding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by Zhugw on 2017/6/22.
 */
public class QueueDemo {
    public static void printQ(Queue queue){
        while (queue.peek()!=null){
            System.out.print(queue.remove()+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<Integer>();
        Random rand=new Random(47);
        for (int i = 0; i <10 ; i++) {
            queue.offer(rand.nextInt(i+10));
        }
        printQ(queue);
        Queue<Character> qc=new LinkedList<Character>();
        for (Character c:"Brontosaurus".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }
}

/*
offer()方法时与Queue相关的方法之一，它在允许的情况下，将一个元素插入到队尾，或者返回
false。peek()和element()都将在不移除的情况下返回队头，但是peek()方法在队列为空时返回
null，而element()会抛出NoSuchElementException异常。poll()和remove()方法将移除并返回
队头，但是poll()在队列为空时返回null，而remove()会抛出NoSuchElementException异常。
 */