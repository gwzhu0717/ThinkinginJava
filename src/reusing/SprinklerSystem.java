package reusing;

/**
 * Created by Zhugw on 2017/6/11.
 */
class WaterSource{
    private String s;

    public WaterSource() {
        System.out.println("WaterSource()");
        s="constructor";
    }

    @Override
    public String toString() {
        return s;
    }
}
public class SprinklerSystem {
    private String valve1,valve2,valve3,valve4;
    private WaterSource source=new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "valve1='" + valve1 + '\'' +
                ", valve2='" + valve2 + '\'' +
                ", valve3='" + valve3 + '\'' +
                ", valve4='" + valve4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers=new SprinklerSystem();
        System.out.println(sprinklers.toString());
    }
}
