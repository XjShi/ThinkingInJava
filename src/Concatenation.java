import java.util.Random;

/**
 * Created by xjshi on 02/03/2017.
 */
public class Concatenation {
    public static void main(String[] args) {
        String mango = "mango";
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);
        Random random = new Random(4);
        Integer tmp = random.nextInt();
    }
}
