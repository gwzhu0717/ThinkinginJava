package interfaces;

import java.util.Random;

/**
 * Created by Zhugw on 2017/6/14.
 */
public interface RandVals {
    Random rand=new Random(47);
    int RANDOM_INT=rand.nextInt(10);
    long RANDOM_LONG=rand.nextLong()*10;
    float RANDOM_FLOAT=rand.nextFloat()*10;
    double RANDOM_DOUBLE=rand.nextDouble()*10;
}
