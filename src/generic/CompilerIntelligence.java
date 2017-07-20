package generic;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xjshi on 03/06/2017.
 */
public class CompilerIntelligence {
    public static void main(String[] args) {
        List<Apple> fruits = Arrays.asList(new Apple());
        Apple a = (Apple) fruits.get(0);
        fruits.contains(new Apple());
        fruits.indexOf(new Apple());

    }
}
