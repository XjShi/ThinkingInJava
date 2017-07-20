package generic.coffee;

/**
 * Created by xjshi on 15/03/2017.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
