package innerclasses;

/**
 * Created by Zhugw on 2017/6/14.
 */
public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;
            PDestination(String whereTo){
                label=whereTo;
            }
            public String readLabel(){
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p=new Parcel5();
        System.out.println(p.destination("Tasmania").readLabel());
    }
}
