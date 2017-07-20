package typeinfo.toys;

/**
 * Created by xjshi on 13/03/2017.
 */
public class GenerictoyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.newInstance();

        Class<? super FancyToy> up = ftClass.getSuperclass();
        // won't compile
//        Class<Toy> up2 = ftClass.getSuperclass();
        Object obj = up.newInstance();

    }
}
