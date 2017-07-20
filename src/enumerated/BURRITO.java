package enumerated;

/**
 * Created by xjshi on 04/06/2017.
 */
public class BURRITO {
    Spiciness degree;

    public BURRITO(Spiciness degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Burrito is " + degree;
    }

    public static void main(String[] args) {
        System.out.println(Spiciness.HOT);
        System.out.println(Spiciness.MEDIUM);

    }
}
