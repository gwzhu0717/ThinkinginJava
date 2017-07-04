package initialization;

/**
 * Created by Zhugw on 2017/6/9.
 */
class tree{
    int height;
    public tree() {
        System.out.println("Planting a seedling");
        height=0;
    }
    public tree(int initialHeight) {
        height=initialHeight;
        System.out.println("Creating new tree that is "+height+" feet tall");
    }
    void info(){
        System.out.println("Tree is "+height+" feet tall");
    }
    void info(String s){
        System.out.println(s+": Tree is "+height+" feet tall");
    }
}
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            tree t=new tree(i);
            t.info();
            t.info("overloaded method");
        }
        new tree();
    }
}
