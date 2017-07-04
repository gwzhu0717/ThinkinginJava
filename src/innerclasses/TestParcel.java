package innerclasses;

/**
 * Created by Zhugw on 2017/6/14.
 */
class Parcel4{
    private class PContents implements Contents{
        private int i=11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination{
        private String label;
        PDestination(String whereto){
            label=whereto;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Contents contents(){
        return new PContents();
    }

    public Destination destination(String s){
        return new PDestination(s);
    }
}
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p=new Parcel4();
        Contents c=p.contents();
        Destination d=p.destination("Tasmania");
    }
}
