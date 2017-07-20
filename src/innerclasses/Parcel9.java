package innerclasses;

/**
 * Created by xjshi on 02/06/2017.
 */
public class Parcel9 {
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }
}
