package reusing;

/**
 * Created by Zhugw on 2017/6/11.
 */
class Soap {
    private String s;
    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }
    public String toString() { return s; }
}
public class Bath {
    private String s1="Happy",s2="Happy",s3;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Inside Both()");
        s3="Joy";
        toy=3.14f;
        castille=new Soap();
    }
    {i=47;}//内部初始化（实例初始化）

    @Override
    public String toString() {
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", castille=" + castille +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }

    public static void main(String[] args) {
        Bath b=new Bath();
        System.out.println(b);
    }
}
