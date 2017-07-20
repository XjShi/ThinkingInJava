package enumerated;

import static net.mindview.util.Print.print;

/**
 * Created by xjshi on 16/03/2017.
 */
enum Signal {
    GREEN,
    RED,
    YELLOW
}

public class TrafficLight {
    Signal color = Signal.GREEN;
    public void change() {
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
                break;

        }
    }

    @Override
    public String toString() {
        return "The traffic light is " + color;
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            print(t);
            t.change();
        }
    }
}
