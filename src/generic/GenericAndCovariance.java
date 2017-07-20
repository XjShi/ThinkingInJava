package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xjshi on 02/06/2017.
 */
public class GenericAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> fruits = new ArrayList<Apple>();
//        fruits.add(new Apple());
    }
}
