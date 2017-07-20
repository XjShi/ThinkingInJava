package containers;

import java.util.*;

/**
 * Created by xjshi on 03/06/2017.
 */
public class Unsupported {
    static void test(String msg, List<String> list) {
        System.out.println("--- " + msg + " ---");
        Collection<String> c = list;
        Collection<String> sublist = list.subList(1, 8);
        Collection<String> c2 = new ArrayList<String>(sublist);

        c.retainAll(c2);

        c.removeAll(c2);

        c.add("x");

        c.addAll(c2);

        c.remove("C");

        list.set(0, "X");
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("Modifiable Copy", new ArrayList<String>(list));
        test("Arrays.asList()", list);
        test("unmodifiableList()", Collections.unmodifiableList(list));
    }
}
