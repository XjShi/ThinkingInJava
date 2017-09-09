package proxy.jdkproxy;

public class Car implements Moveable {
    @Override
    public void move() {
        System.out.println("car move.");
    }
}
