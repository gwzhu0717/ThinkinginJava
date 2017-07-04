package reusing;

/**
 * Created by Zhugw on 2017/6/11.
 */
public class SpaceShip extends SpaceShipControls{
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SpaceShip protector=new SpaceShip("NSEA protector");
        protector.forward(100);
    }
}
