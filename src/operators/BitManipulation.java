package operators;

import java.util.Random;

/**
 * Created by Zhugw on 2017/6/8.
 */
public class BitManipulation {
    public static void main(String[] args) {
        Random rand=new Random(47);
        int i=rand.nextInt();
        int j=rand.nextInt();
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(1));
        int maxpos=2147483647;
        int maxneg=-2147483648;
        System.out.println("maxpos: "+Integer.toBinaryString(maxpos));
        System.out.println("maxneg: "+Integer.toBinaryString(maxneg));
        System.out.println("i: "+Integer.toBinaryString(i));
        System.out.println("~i: "+Integer.toBinaryString(~i));
        System.out.println("-i: "+Integer.toBinaryString(-i));
        System.out.println("j: "+Integer.toBinaryString(j));
        System.out.println("i&j: "+Integer.toBinaryString(i&j));
        System.out.println("i|j: "+Integer.toBinaryString(i|j));
        System.out.println("i^j: "+Integer.toBinaryString(i^j));
        System.out.println("i<<5: "+Integer.toBinaryString(i<<5));
        System.out.println("i>>5: "+Integer.toBinaryString(i>>5));
        System.out.println("(~i)>>5: "+Integer.toBinaryString((~i)>>5));
        System.out.println("i>>>5: "+Integer.toBinaryString(i>>>5));
        System.out.println("(~i)>>>5: "+Integer.toBinaryString((~i)>>>5));
        long l=rand.nextLong();
        long m=rand.nextLong();
        System.out.println("-1L: "+ (-1L));
        System.out.println("1L: "+1L);
        long ll=9223372036854775807L;
        long lln=-9223372036854775808L;
        System.out.println("maxpos: "+Long.toBinaryString(ll));
        System.out.println("maxneg: "+Long.toBinaryString(lln));
        System.out.println("l: "+Long.toBinaryString(l));
        System.out.println("~l: "+Long.toBinaryString(~l));
        System.out.println("-l: "+Long.toBinaryString(-l));
        System.out.println("m: "+Long.toBinaryString(m));
        System.out.println("l&m: "+Long.toBinaryString(l&m));
        System.out.println("l|m: "+Long.toBinaryString(l|m));
        System.out.println("l^m: "+Long.toBinaryString(l^m));
        System.out.println("l<<5: "+Long.toBinaryString(l<<5));
        System.out.println("l>>5: "+Long.toBinaryString(l>>5));
        System.out.println("(~l)>>5: "+Long.toBinaryString((~l)>>5));
        System.out.println("l>>>5: "+Long.toBinaryString(l>>>5));
        System.out.println("(~l)>>>5: "+Long.toBinaryString((~l)>>>5));
    }
}
