package innerclasses;

/**
 * Created by xjshi on 02/06/2017.
 */
public class Parcel7 {
    public Content content() {
        return new Content() {
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }
}

class Parcel7b {
    class MyContent implements Content {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    public Content content() {
        return new MyContent();
    }
}