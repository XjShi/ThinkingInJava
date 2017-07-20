package generic;

/**
 * Created by xjshi on 15/03/2017.
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> holder3 = new Holder3<Automobile>(new Automobile());
        Automobile a = holder3.getA();
    }
}

class Automobile {

}
