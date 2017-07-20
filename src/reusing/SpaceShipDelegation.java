package reusing;

/**
 * Created by xjshi on 03/03/2017.
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public void down(int volecity) {
        controls.down(volecity);
    }

    public void left(int volecity) {
        controls.left(volecity);
    }

    public void right(int volecity) {
        controls.right(volecity);
    }

    public void forward(int volecity) {
        controls.forward(volecity);
    }

    public void backward(int volecity) {
        controls.backward(volecity);
    }

    public void back(int volecity) {
        controls.back(volecity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation protecter = new SpaceShipDelegation("NSEA Protector");
        protecter.forward(100);
    }
}
