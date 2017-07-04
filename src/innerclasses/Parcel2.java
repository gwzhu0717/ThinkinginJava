package innerclasses;

/**
 * Created by Zhugw on 2017/6/14.
 */
public class Parcel2 {
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

    public Destination to(String s){
        return new Destination(s);
    }

    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents c=contents();
        Destination d=to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p=new Parcel2();
        p.ship("Tasmania");

        Parcel2 q=new Parcel2();

        Parcel2.Contents c=q.contents();
        Parcel2.Destination  d=q.to("Borneo");
    }
}
