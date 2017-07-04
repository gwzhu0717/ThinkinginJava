package innerclasses;

/**
 * Created by Zhugw on 2017/6/14.
 */
public class Parcel1 {
    class Contents{
        private int i=11;

        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;

        public Destination(String label) {
            this.label = label;
        }

        String readLabel(){
            return label;
        }
    }

    public void ship(String dest){
        Contents c=new Contents();
        Destination d=new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p=new Parcel1();
        p.ship("Tasmania");
    }
}
