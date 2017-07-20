package containers;

/**
 * Created by xjshi on 04/06/2017.
 */
public class StringHashCode {
    public static void main(String[] args) {
        String[] hellos = "hello hello".split(" ");
        System.out.println(hellos[0].hashCode());
        System.out.print(hellos[1].hashCode());
    }

}
