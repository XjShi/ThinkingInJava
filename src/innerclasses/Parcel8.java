package innerclasses;

/**
 * Created by xjshi on 02/06/2017.
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value() * 47;
            }
        };
    }
}
